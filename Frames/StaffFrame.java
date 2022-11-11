package Frames;

import Classes.Staff;
import Panels.StaffPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StaffFrame extends JFrame {

    ArrayList<Staff> staffArray = new ArrayList<>();
    StaffPanel staffPanel = new StaffPanel(staffArray);

    public StaffFrame(){
        setTitle("Accounting Application - Staff Information");
        setSize(300,270);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        add(staffPanel);
    }
}
