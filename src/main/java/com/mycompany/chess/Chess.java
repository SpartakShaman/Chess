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
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(('A'+"")+(0 + " "));
//        System.out.println('H'+0 + " ");
        Position pos = new Position(2, 'B');
//        System.out.println(pos.toString());
//        System.out.println('C'+0);
        Peshka pesh1 = new Peshka(EnumColor.WHITE ,pos);
        for (Position a: pesh1.getAllStaps())
        {
            System.out.println(a.toString());
        }
    }
    
}
