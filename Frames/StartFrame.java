package Frames;

import Panels.StartPanel;

import javax.swing.*;
import java.awt.*;

public class StartFrame extends JFrame {
    StartPanel startPanel = new StartPanel();

    public StartFrame(){
        setTitle("Accounting Application - Home");
        setSize(300,270);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        add(startPanel);
    }
}
