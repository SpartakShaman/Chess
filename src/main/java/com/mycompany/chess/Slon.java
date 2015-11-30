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

    private int limit = 7;

    public int getLimit() {
        return limit;
    }
    
    @Override
    public List<Position> getAllSteps() {
        
        List<Position> all = new ArrayList();         
                                        
        all.addAll(super.diagonal(limit, Figure.FORVARD, Figure.RIGHT));
        all.addAll(super.diagonal(limit, Figure.FORVARD, Figure.LEFT));
        all.addAll(super.diagonal(limit, Figure.BACK, Figure.RIGHT));
        all.addAll(super.diagonal(limit, Figure.BACK, Figure.LEFT));
       
        
        return all;
    
    }

    public Slon(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
