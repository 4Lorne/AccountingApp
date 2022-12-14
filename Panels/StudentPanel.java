package Panels;

import Classes.Model;
import Classes.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentPanel extends JPanel {
    //Variables
    int studentYear = 0;
    String studentName = "";
    String studentAddress = "";

    //Constraints for GridBag
    GridBagConstraints c = new GridBagConstraints();

    public StudentPanel(Model model) {
        setLayout(new GridBagLayout());
        setVisible(true);

        c.insets = new Insets(5, 5, 5, 5);

        //*****
        JLabel labelStudentYear = new JLabel("Enter student year (1-4)");
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx = 0;
        c.gridy = 0;
        add(labelStudentYear, c);

        JTextField enterStudentYear = new JTextField(15);
        c.gridx = 0;
        c.gridy = 1;
        add(enterStudentYear, c);

        JButton confirmStudentInput = new JButton("Confirm");
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        add(confirmStudentInput, c);
        confirmStudentInput.addActionListener(e -> {
            try {
                studentYear = Integer.parseInt(enterStudentYear.getText());
            } catch (Exception f) {
                f.printStackTrace();
            }
            if (enterStudentYear.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a number.");
            } else if (studentYear > 4 || studentYear < 1) {
                JOptionPane.showMessageDialog(null, "Please enter an integer between 1 and 4.");
            }
        });

        //******
        JLabel labelStudentName = new JLabel("Enter student name");
        c.gridx = 0;
        c.gridy = 2;
        add(labelStudentName, c);

        JTextField enterName = new JTextField("", 15);
        c.gridx = 0;
        c.gridy = 3;
        add(enterName, c);

        JButton confirmStudentName = new JButton("Confirm");
        c.gridx = 1;
        c.gridy = 3;
        add(confirmStudentName, c);

        confirmStudentName.addActionListener(e -> {
            try {
                studentName = enterName.getText();
            } catch (Exception f) {
                f.printStackTrace();
            }
            if (enterName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid information.");
            }
        });
        //******

        //******
        JLabel labelStudentAddress = new JLabel("Enter student address");
        c.gridx = 0;
        c.gridy = 4;
        add(labelStudentAddress, c);

        JTextField enterAddress = new JTextField("", 15);
        c.gridx = 0;
        c.gridy = 5;
        add(enterAddress, c);

        JButton confirmStudentAddress = new JButton("Confirm");
        c.gridx = 1;
        c.gridy = 5;
        add(confirmStudentAddress, c);

        confirmStudentAddress.addActionListener(e -> {
            try {
                studentAddress = enterAddress.getText();
            } catch (Exception f) {
                f.printStackTrace();
            }
            if (enterAddress.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter valid information.");
            }
        });
        //******


        JButton generateStudent = new JButton("Generate Student");
        c.insets = new Insets(10, 5, 5, 0);
        c.gridx = 0;
        c.gridy = 7;
        add(generateStudent, c);

        //Creates student from information gathered.
        //Validates all text boxes are filled and submitted.
        generateStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (studentYear == 0) {
                    JOptionPane.showMessageDialog(null, "Please click submit for Student Year.");
                }
                if (studentAddress.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please click submit for Student Address.");
                }
                if (studentName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please click submit for Student Name.");
                }
                if (!enterName.getText().isEmpty() && !enterAddress.getText().isEmpty() && !enterStudentYear.getText().isEmpty()) {
                    if (studentYear > 0 && studentAddress.length() > 1 && studentName.length() > 1) {
                        model.addStudent(studentName, studentAddress, studentYear);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill all text boxes.");
                }
                System.out.println(model);
            }
        });

        JButton backButton = new JButton("Back");
        c.gridx = 1;
        c.gridy = 7;
        add(backButton, c);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTopLevelAncestor().setVisible(false);
            }
        });
    }

}
