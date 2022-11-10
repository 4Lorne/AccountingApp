package GUI;

import Classes.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {
    JPanel panelStart = new JPanel(new GridBagLayout());
    JPanel panelStudent = new JPanel(new GridBagLayout());
    JPanel panelStaff = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    StudentPanel studentPanel = new StudentPanel();

    public Frame(){
        setTitle("Accounting Application");
        //Size of the frame
        setSize(300,150);
        setPanelStart();
    }

    void setPanelStart(){
        setLayout(new GridBagLayout());
        //NOTE
        //Buttons need to be added to the panel before being
        //Added to the frame.

        //Buttons will grow with the screen
        c.weightx=0.5;
        c.insets= new Insets(5,5,5,5);

        //Adding label to the panel
        JLabel select = new JLabel("Select student or staff.");
        c.fill=GridBagConstraints.CENTER;
        //Sets number of cells in x row to 0, centering the label
        c.gridwidth=0;
        c.gridx=0;
        c.gridy=0;
        panelStart.add(select,c);

        //Adding the buttons to the start panel
        JButton student = new JButton("Student");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth=1;
        c.gridx=0;
        c.gridy=5;
        panelStart.add(student,c);

        JButton staff = new JButton("Staff");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=5;
        panelStart.add(staff,c);

        JButton exit = new JButton("Exit");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=2;
        c.gridy=5;
        panelStart.add(exit,c);

        //Adding the panel to the frame
        add(studentPanel);
        add(panelStaff);
        add(panelStart);

        //Hides the first panel, shows the one chosen.
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelStart.setVisible(false);
                panelStaff.setVisible(false);
                //TODO: Figure out how to put this in StudentPanel.java
                setSize(300,250);
                studentPanel.setVisible(true);
            }
        });

//        staff.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panelStart.setVisible(false);
//                panelStudent.setVisible(false);
//                panelStaff.setVisible(true);
//            }
//        });
    }

}
