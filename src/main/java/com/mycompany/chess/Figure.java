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
public abstract class Figure {
    public final static int FORVARD = 1;
    public final static int BACK = -1;
    
    public final static int LEFT = -1;
    public final static int RIGHT = 1;
    
    
    private EnumColor color;
    Position xy;
    

    public Figure(EnumColor color, Position xy) {
        this.color = color;
        this.xy = xy;
    }

    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }

    public Position getXY() {
        return xy;
    }

    public void setXY(Position xy) {
        this.xy = xy;
    }
    public abstract List <Position> getAllSteps();
    
    public void move(Position xy){
        setXY(xy);
        //Задел на будущее...
    }
    
    protected List <Position> forvard_back (int limit, int forvard_back)
    {   List<Position> positions = new ArrayList();

        for (int i= 1; i <= limit; i++)    
        {   
            if (Position.isLimitX(xy.getX() + i*forvard_back * this.color.getValue()))
            {
                    positions.add(
                            new Position( 
                                        xy.getX() + i*forvard_back * this.color.getValue(),
                                        xy.getY()
                                        )
                    );
            } else 
            {
                break;
            }   
        }
   
        return positions;
    }
    
    protected List<Position> left_right(int limit, int left_right) {
        List<Position> positions = new ArrayList();

        for (int i = 1; i <= limit; i++) {
            if (Position.isLimitY(xy.getY() + i * left_right)) {
                positions.add(
                        new Position(
                                xy.getX(),
                                (char) (xy.getY() + i * left_right)
                        )
                );
            } else {
                break;
            }
        }

        return positions;
    }
    
      protected List <Position> diagonal (int limit, int forvard_back, int left_right)
    {   List<Position> positions = new ArrayList();

        for (int i= 1; i <= limit; i++)    
        {   
            if (Position.isLimitX(xy.getX() + i*forvard_back * this.color.getValue()) && Position.isLimitY(xy.getY() + i*forvard_back*left_right))
            {
                    positions.add(
                            new Position( 
                                        xy.getX() + i*forvard_back * this.color.getValue(),
                                        (char)(xy.getY() + i*forvard_back*left_right)
                                        )
                    );
            } 
            else {
              break;      
            } 
        }
   
        return positions;
    }
      
      protected List<Position> horse() {
        List<Position> positions = new ArrayList();
        
        // Have a horse running 8 possible positions, placed in a circle around him. Using sin and cos
        // calculate the rate according to the angle of displacement of the coordinate axes x and y with base
        // in tsentarlnoy point where the figure. Starting angle of 30 degrees, pitch angle - 45 degrees.
        // the radius of the circle is assumed equal to 2, the drive is calculated koordtnaty rounding to whole (cell chessboard).
        // У коня 8 возможных позиций хода, размещенных по кругу вокруг него. Используя sin  и cos
        // вычисляем в завиcимости от угла смещение координат по осям x и y с основанием
        // в центарльной точке, где находится фигура. Стартовый угол 30 градусов,шаг угла - 45 град.
        // Радиус круга принимаем равным 2, округлением приводим вычисляемые коордтнаты к целым (клеткам доски).
        int xx, yy;
        for (int i = 0; i <= 7; i++) {
            xx = (int) Math.round(2 * Math.cos(Math.toRadians(30 + i * 45)));
            yy = (int) Math.round(2 * Math.sin(Math.toRadians(30 + i * 45)));
        // Check the calculated coordinates turn to get into the field of the chessboard.
            if (Position.isLimitX(xy.getX() + xx) && Position.isLimitY(xy.getY() + yy)) {
                positions.add(new Position(
                        xy.getX() + xx,
                        (char) (xy.getY() + yy)
                )
                );
            }
        }

        return positions;
    }
}
