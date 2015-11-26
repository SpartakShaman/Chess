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
public class Peshka extends Figure {

    @Override
    public List<Position> getAllStaps() {
        
        List<Position> all = new ArrayList(); 
        
        int limit = 1;
        if ((super.xy.x == 2 && super.getColor().equals(EnumColor.WHITE)) || (super.xy.x == 7 && super.getColor().equals(EnumColor.BLACK)))
        {
                limit = 2;
        }
                         
        all.addAll(super.forvard_back(super.getXY(), limit, Figure.FORVARD));
        
        return all;
    
    }

    public Peshka(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
