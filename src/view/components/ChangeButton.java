package view.components;

import helpers.ConsoleLogger;

import javax.swing.*;
import java.awt.*;

public class ChangeButton extends JButton {

    public ChangeButton(String text, int x) {
        setText(text);
        setBackground(Color.darkGray);
        setForeground(Color.white);
        setBounds(x, 10, 120,20);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setFocusable(false);
        ConsoleLogger.printLog("created ChangeButton");
    }
}
