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
public class Slon extends Figure {

    @Override
    public List<Position> getAllStaps() {
        
        List<Position> all = new ArrayList(); 
        
        int limit = 7;
                                
        all.addAll(super.diagonal(super.getXY(), limit, Figure.FORVARD));
        all.addAll(super.diagonal(super.getXY(), limit, Figure.BACK));
       
        
        return all;
    
    }

    public Slon(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
