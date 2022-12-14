package Frames;

import Classes.Model;
import Classes.Staff;
import Panels.StaffPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StaffFrame extends JFrame {
    Model model = new Model();
    StaffPanel staffPanel = new StaffPanel(model);

    public StaffFrame() {
        setTitle("Accounting Application - Staff Information");
        setSize(300, 270);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        add(staffPanel);
    }
}
