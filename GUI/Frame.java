package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Frame extends JFrame {
    JLabel select = new JLabel("Select student or staff.");
    JPanel panel = new JPanel();
    JButton student = new JButton("Student");
    JButton staff = new JButton("Staff");
    JButton exit = new JButton("Exit");
    BorderLayout borderLayout = new BorderLayout(20,30);

    public Frame(){
        //Buttons need to be added to the panel before being
        //Added to the frame.
        setLayout(borderLayout);
        panel.setLayout(borderLayout);
        setSize(300,200);

        //Adding the buttons to the panel
        panel.add(select);
        panel.add(student);
        panel.add(staff);
        panel.add(exit);

        student.setBounds(20,100,80,30);
        staff.setBounds(100,100,80,30);
        select.setBounds(150,0,150,100);
        exit.setBounds(250,100,80,30);


        //Adding the panel to the frame
        add(panel);

    }
}
