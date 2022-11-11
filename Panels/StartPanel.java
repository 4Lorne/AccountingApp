package Panels;

import Classes.Model;
import Frames.ReportFrame;
import Frames.StaffFrame;
import Frames.StudentFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPanel extends JPanel {
    GridBagConstraints c = new GridBagConstraints();

    Model model = new Model();

    public StartPanel() {
        setLayout(new GridBagLayout());
        setVisible(true);

        //Buttons will grow with the screen
        c.insets = new Insets(5, 5, 5, 5);

        //Adding label to the panel
        JLabel select = new JLabel("Select student or staff.");
        c.fill = GridBagConstraints.CENTER;
        //Sets number of cells in x row to 0, centering the label
        c.gridwidth = 0;
        c.gridx = 0;
        c.gridy = 0;
        add(select, c);

        //Adding the buttons to the start panel
        JButton student = new JButton("Student");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 5;
        add(student, c);

        JButton staff = new JButton("Staff");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 5;
        add(staff, c);

        JButton exit = new JButton("Generate Report");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 5;
        add(exit, c);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ReportFrame();
                System.out.println(model.toString());
            }
        });

        //Opens a new window for the selected button.
        student.addActionListener(e -> {
            new StudentFrame(model);
        });

        staff.addActionListener(e -> {
            new StaffFrame();
        });
    }
}
