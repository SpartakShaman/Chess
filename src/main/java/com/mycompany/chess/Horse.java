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
public class Horse extends Figure {

    @Override
    public List<Position> getAllStaps() {
        
        List<Position> all = new ArrayList();         
                             
        all.addAll(super.horse(super.getXY()));
               
        return all;    
    }

    public Horse(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
