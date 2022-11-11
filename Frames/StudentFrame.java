package Frames;

import Classes.Student;
import Panels.StudentPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StudentFrame extends JFrame {

    ArrayList<Student> studentArray = new ArrayList<>();
    StudentPanel studentPanel = new StudentPanel(studentArray);

    public StudentFrame(){
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
