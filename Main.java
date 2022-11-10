import GUI.StartPanel;

import javax.swing.*;
import java.awt.*;

//TODO: Create new JFrame when clicking on Student / Staff / Generate Report

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StartPanel startPanel = new StartPanel();
                startPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                startPanel.setVisible(true);
                startPanel.setResizable(false);
                startPanel.setLocationRelativeTo(null);
                startPanel.pack();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
