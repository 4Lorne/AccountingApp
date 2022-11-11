import Frames.StartFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StartFrame startFrame = new StartFrame();
                startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                startFrame.setVisible(true);
                startFrame.setResizable(false);
                startFrame.setLocationRelativeTo(null);
                startFrame.pack();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
