package GUI;

import javax.swing.*;
import java.awt.*;

public class StudentPanel extends JPanel {
    //Variables
    int studentYear = 0;
    String studentName = "";
    String studentAddress = "";

    //Constraints for GridBag
    GridBagConstraints c = new GridBagConstraints();

    StudentPanel(){
        setLayout(new GridBagLayout());
        setVisible(false);

        //Buttons will grow with the screen
        c.weightx=0.5;
        c.insets= new Insets(5,5,5,5);

        //*****
        JLabel studentYear = new JLabel("Enter student year (1-4)");
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx=0;
        c.gridy=0;
        add(studentYear,c);

        JTextField enterStudentYear = new JTextField(15);
        c.gridx=0;
        c.gridy=1;
        add(enterStudentYear,c);

        JButton confirmStudentInput = new JButton("Confirm");
        c.gridwidth=1;
        c.gridx=1;
        c.gridy=1;
        add(confirmStudentInput,c);
        //TODO set values to Student class
        confirmStudentInput.addActionListener(e -> {
            try {
                StudentPanel.this.studentYear = Integer.parseInt(enterStudentYear.getText());
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterStudentYear.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter a number.");
            } else if (StudentPanel.this.studentYear > 4 || StudentPanel.this.studentYear < 1){
                JOptionPane.showMessageDialog(null,"Please enter an integer between 1 and 4.");
            }
        });

        //******
        JLabel studentName = new JLabel("Enter student name");
        c.gridx=0;
        c.gridy=2;
        add(studentName,c);

        JTextField enterName = new JTextField("",15);
        c.gridx=0;
        c.gridy=3;
        add(enterName,c);

        JButton confirmStudentName = new JButton("Confirm");
        c.gridx=1;
        c.gridy=3;
        add(confirmStudentName,c);

        //TODO set values to Student class
        confirmStudentName.addActionListener(e -> {
            try {
                StudentPanel.this.studentName = confirmStudentName.getText();
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterStudentYear.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
            }
        });
        //******

        //******
        JLabel studentAddress = new JLabel("Enter student address");
        c.gridx=0;
        c.gridy=4;
        add(studentAddress,c);

        JTextField enterAddress = new JTextField("",15);
        c.gridx=0;
        c.gridy=5;
        add(enterAddress,c);

        JButton confirmStudentAddress = new JButton("Confirm");
        c.gridx=1;
        c.gridy=5;
        add(confirmStudentAddress,c);

        //TODO set values to Student class
        confirmStudentAddress.addActionListener(e -> {
            try {
                StudentPanel.this.studentAddress = enterAddress.getText();
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterAddress.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
            }
        });
        //******

        JButton generateReport = new JButton("Generate Report");
        c.insets= new Insets(10,5,5,0);
        c.gridx=0;
        c.gridy=7;
        add(generateReport,c);

        JButton backButton = new JButton("Back");
        c.gridx=1;
        c.gridy=7;
        add(backButton,c);
    }
}
