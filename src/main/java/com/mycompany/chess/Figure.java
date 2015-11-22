/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chess;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vlad
 */
public abstract class Figure {
    public final static int FORVARD = 1;
    public final static int BACK = -1;
    
    public final static int LEFT = -1;
    public final static int RIGHT = 1;
    
    
    private EnumColor color;
    Position xy;
    

    public Figure(EnumColor color, Position xy) {
        this.color = color;
        this.xy = xy;
    }

    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public Position getXy() {
        return xy;
    }

    public void setXy(Position xy) {
        this.xy = xy;
    }
    public abstract List <Position> getAllStaps();
    
    protected List <Position> forvard_back (Position pos, int limit, int forvard_back)
    {   List<Position> positions = new ArrayList();

        for (int i= 0; i < limit; i++)    
        {   
            if (Position.isLimitY((char)(pos.x + forvard_back * this.color.getValue())))
            {
                    positions.add(
                            new Position( 
                                        (byte)(pos.x + forvard_back * this.color.getValue()),
                                        pos.y
                                        )
                    );
            } else 
            {
                break;
            }   
        }
   
        return positions;
    }
}
