package Frames;

import Classes.Model;
import Panels.StudentPanel;

import javax.swing.*;
import java.awt.*;

public class StudentFrame extends JFrame {
    Model model = new Model();
    StudentPanel studentPanel = new StudentPanel(model);

    public StudentFrame(Model model){
        setTitle("Accounting Application - Student Information");
        setSize(300,270);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        add(studentPanel);
    }
}
