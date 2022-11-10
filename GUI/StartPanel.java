package GUI;

import javax.swing.*;
import java.awt.*;


public class StartPanel extends JFrame {
    GridBagConstraints c = new GridBagConstraints();

    JPanel panelStart = new JPanel(new GridBagLayout());
    StudentPanel studentPanel = new StudentPanel();
    StaffPanel staffPanel = new StaffPanel();

    public StartPanel(){
        setTitle("Accounting Application");
        //Size of the frame
        setSize(300,150);
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
        add(staffPanel);
        add(panelStart);

        //Hides the first panel, shows the one chosen.
        student.addActionListener(e -> {
            panelStart.setVisible(false);
            //TODO: Figure out how to put this in StudentPanel.java
            setSize(300,270);
            studentPanel.setVisible(true);
        });

        staff.addActionListener(e -> {
            panelStart.setVisible(false);
            setSize(300,270);
            staffPanel.setVisible(true);
        });
    }
}
