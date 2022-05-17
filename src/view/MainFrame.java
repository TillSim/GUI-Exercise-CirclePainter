package view;

import helpers.ConsoleLogger;
import view.components.MainPanel;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        JPanel mainPanel = new MainPanel();
        ImageIcon logo = new ImageIcon("./img/logo.png");

        setTitle("Circle Painter");
        setIconImage(logo.getImage());
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(540,500);

        add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ConsoleLogger.printLog("created MainFrame");
    }
}
