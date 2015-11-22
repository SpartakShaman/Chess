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
public class Position {
   byte x;
   char y;

    public Position(byte i, char y) {
        this.x = i;
        this.y = y;
    }

    public byte getX() {
        return x;
    }

    public void setX(byte x) {
        this.x = x;
    }

    public char getY() {
        return y;
    }

    public void setY(char y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  (x+"") +(y+"");
    }
   public static boolean isLimitX(byte x)
   {
     return ( x > 0 ) && ( x < 9 ); 
   }
   public static boolean isLimitY(char y)
   {
     return ( y > 65 ) && ( y < 72 ); 
   }
}
