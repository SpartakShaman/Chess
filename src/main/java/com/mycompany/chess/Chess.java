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

        Position pos = new Position(3, 'C');
        System.out.println("Координаты = " + pos.toString());
        
//        System.out.println("Peshka");
//        Peshka pesh1 = new Peshka(EnumColor.WHITE ,pos);
//        for (Position a: pesh1.getAllStaps())
//        {
//            System.out.println(a.toString());
//        }
        
//        System.out.println("Tura ");
//        Tura tura1 = new Tura(EnumColor.BLACK ,pos);
//         for (Position a: tura1.getAllStaps())
//        {
//            System.out.println(a.toString());
//        }
         
//        System.out.println("Slon ");
//        Slon slon1 = new Slon(EnumColor.BLACK ,pos);
//         for (Position a: slon1.getAllStaps())
//        {
//            System.out.println(a.toString());
//        }
         
//        System.out.println("Ferz ");
//        Ferz ferz1 = new Ferz(EnumColor.BLACK ,pos);
//         for (Position a: ferz1.getAllStaps())
//        {
//            System.out.println(a.toString());
//        }
         
//                 System.out.println("King ");
//        King king1 = new King(EnumColor.BLACK ,pos);
//         for (Position a: king1.getAllStaps())
//        {
//            System.out.println(a.toString());
//        }
         
        System.out.println("Horse ");
        Horse horse1 = new Horse(EnumColor.WHITE, pos);
        for (Position a : horse1.getAllStaps()) {
            System.out.println(a.toString());
        }
    }
    
}
