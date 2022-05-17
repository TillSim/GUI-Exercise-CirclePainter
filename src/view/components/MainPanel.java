package view.components;

import helpers.ConsoleLogger;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel() {
        setLayout(null);
        setBounds(0,0,540,500);
        setBackground(Color.lightGray);

        JButton changeLocationBTN = new ChangeButton("Change Location", 10);
        JButton changeColorBTN = new ChangeButton("Change Color", 140);
        JButton changeDiameterBTN = new ChangeButton("Change Diameter", 270);
        JButton changeAllBTN = new ChangeButton("Change All", 400);
        CircleDrawing circleDrawing = new CircleDrawing();

        add(changeLocationBTN);
        add(changeColorBTN);
        add(changeDiameterBTN);
        add(changeAllBTN);
        add(circleDrawing);

        changeLocationBTN.addActionListener(e -> circleDrawing.changeLocation());
        changeColorBTN.addActionListener(e -> circleDrawing.changeColor());
        changeDiameterBTN.addActionListener(e -> circleDrawing.changeDiameter());
        changeAllBTN.addActionListener(e -> circleDrawing.changeAll());

        ConsoleLogger.printLog("created MainPanel");
    }

}
