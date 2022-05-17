package view.components;

import helpers.ConsoleLogger;
import model.Circle;

import javax.swing.JComponent;
import java.awt.*;

/**
 * <b>CircleDrawing</b> is a JComponent for painting and repainting a <i>Circle</i>
 */
public class CircleDrawing extends JComponent {

    Circle circle = new Circle();


    public CircleDrawing() {
        setBounds(0, 50, 540, 400);

        ConsoleLogger.printLog("created CircleDrawing");
    }


    @Override
    public void paintComponent(Graphics g) {
        g.setColor(circle.getColor());
        g.fillOval(circle.getX(),circle.getY(),circle.getDiameter(),circle.getDiameter());
    }


    public void changeColor() {
        circle.changeColor();
        repaint();

        ConsoleLogger.printLog("changed color to " + circle.getColor().toString().replace("java.awt.Color", ""));
    }

    public void changeLocation() {
        circle.changeLocation();
        repaint();

        ConsoleLogger.printLog("changed location to [x=" + circle.getX() + ",y=" + circle.getY() + "]");
    }

    public void changeDiameter() {
        circle.changeDiameter();
        repaint();

        ConsoleLogger.printLog("changed diameter to [" + circle.getDiameter() + "]");
    }

    public void changeAll() {
        circle.changeColor();
        circle.changeLocation();
        circle.changeDiameter();
        repaint();

        ConsoleLogger.printLog(
                "changed color to " + circle.getColor().toString().replace("java.awt.Color", "") + "\n\t\t\t" +
                        "changed location to [x=" + circle.getX() + ",y=" + circle.getY() + "]" + "\n\t\t\t" +
                        "changed diameter to [" + circle.getDiameter() + "]"
        );
    }

}
