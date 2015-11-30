/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chess;

import com.mycompany.chess.EnumColor;
import com.mycompany.chess.Figure;
import com.mycompany.chess.Position;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vlad
 */
public class Ferz extends Figure {

    private int limit = 7;

    public int getLimit() {
        return limit;
    }
    
    @Override
    public List<Position> getAllSteps() {
        
        List<Position> all = new ArrayList(); 
        
        all.addAll(super.forvard_back(limit, Figure.FORVARD));
        all.addAll(super.forvard_back(limit, Figure.BACK));
        all.addAll(super.left_right(limit, Figure.LEFT));
        all.addAll(super.left_right(limit, Figure.RIGHT));
                                
        all.addAll(super.diagonal(limit, Figure.FORVARD, Figure.RIGHT));
        all.addAll(super.diagonal(limit, Figure.FORVARD, Figure.LEFT));
        all.addAll(super.diagonal(limit, Figure.BACK, Figure.RIGHT));
        all.addAll(super.diagonal(limit, Figure.BACK, Figure.LEFT));
       
        
        return all;
    
    }

    public Ferz(EnumColor color, Position xy) {
        super(color, xy);
        
    }
    
}
