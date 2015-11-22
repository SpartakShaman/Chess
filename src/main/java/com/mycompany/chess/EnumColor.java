/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chess;

/**
 *
 * @author Vlad
 */
public enum EnumColor {

    BLACK(-1), WHITE(1);
    
    int value;

    private EnumColor(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
