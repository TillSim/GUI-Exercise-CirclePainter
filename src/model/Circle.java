package model;

import helpers.ConsoleLogger;

import java.awt.Color;

/**
 * <b>Circle</b> holds <i>location</i> (x,y), <i>diameter</i> and <i>color</i> and handles random changes to these parameters
 */
public class Circle {

    private int x,y, diameter;
    private Color color;


    /**
     * creates default <b>Circle</b>
     */
    public Circle() {
        color = Color.black;
        diameter = 100;
        ConsoleLogger.printLog("created Circle");
    }


    /**
     * changes location to random location (x<400,y<300)
     */
    public void changeLocation() {
        x = 1 + (int) (Math.random() * 400);
        y = 1 + (int) (Math.random() * 300);
    }

    /**
     * changes color to random color (rgb)
     */
    public void changeColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        setColor(new Color(r,g,b));
    }

    /**
     * changes diameter to random diameter (<100)
     */
    public void changeDiameter() {
        diameter = 1 + (int) (Math.random() * 100);
    }


    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    public int getDiameter() {return diameter;}

    public void setDiameter(int diameter) {this.diameter = diameter;}

    public Color getColor() {return color;}

    public void setColor(Color color) {this.color = color;}
}
