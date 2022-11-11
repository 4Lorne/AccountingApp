import Classes.Model;
import Frames.StartFrame;

import javax.swing.*;
import java.awt.*;

//TODO: Create new JFrame when clicking on Student / Staff / Generate Report

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StartFrame startFrame = new StartFrame();
                startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                startFrame.setVisible(true);
                startFrame.setResizable(false);
                startFrame.setLocationRelativeTo(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
