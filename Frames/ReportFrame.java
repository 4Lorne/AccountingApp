package Frames;

import Classes.Model;
import Panels.ReportPanel;

import javax.swing.*;
import java.awt.*;

public class ReportFrame extends JFrame {
    Model model = new Model();
    ReportPanel reportPanel = new ReportPanel(model);

    public ReportFrame(){
        setTitle("Accounting Application - Report");
        setSize(600, 270);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        add(reportPanel);
    }
}
