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
   int x;
   char y;

    public Position(int x, char y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
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
        return  (y+"") +(x+"");
    }
   public static boolean isLimitX(int x)
   {
     return ( x > 0 ) && ( x < 9 ); 
   }
   public static boolean isLimitY(int y)
   {
     return ( y > 64 ) && ( y < 73 ); 
   }
}
