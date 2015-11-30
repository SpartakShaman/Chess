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
    
    private int limit = 1;

    public int getLimit() {
        return limit;
    }
    
    @Override
    public List<Position> getAllSteps() {
        
        List<Position> all = new ArrayList();         
      
        if ((super.xy.x == 2 && super.getColor().equals(EnumColor.WHITE)) || (super.xy.x == 7 && super.getColor().equals(EnumColor.BLACK)))
        {
                limit = 2;
        }
                         
        all.addAll(super.forvard_back(limit, Figure.FORVARD));
        all.addAll(super.diagonal(1, Figure.FORVARD, Figure.RIGHT));
        all.addAll(super.diagonal(1, Figure.FORVARD, Figure.LEFT));
               
        return all;
    
    }

    public Peshka(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
