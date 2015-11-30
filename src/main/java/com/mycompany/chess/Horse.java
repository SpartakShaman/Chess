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
    public List<Position> getAllSteps() {
        
        List<Position> all = new ArrayList();         
                             
        all.addAll(super.horse());
               
        return all;    
    }

    public Horse(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
