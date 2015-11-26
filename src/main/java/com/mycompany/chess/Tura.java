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
public class Tura extends Figure {

    @Override
    public List<Position> getAllStaps() {
        
        List<Position> all = new ArrayList(); 
        
        int limit = 8;
                                
        all.addAll(super.forvard_back(super.getXY(), limit, Figure.FORVARD));
        all.addAll(super.forvard_back(super.getXY(), limit, Figure.BACK));
        all.addAll(super.left_right(super.getXY(), limit, Figure.LEFT));
        all.addAll(super.left_right(super.getXY(), limit, Figure.RIGHT));
        
        return all;
    
    }

    public Tura(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
