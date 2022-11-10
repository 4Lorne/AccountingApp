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


    public Frame(){
        setTitle("Accounting Application");
        //Size of the frame
        setSize(300,150);
        setPanelStart();
    }

    void setPanelStart(){
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
        add(panelStudent);
        add(panelStaff);
        add(panelStart);

        //Hides the first panel, shows the one chosen.
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelStart.setVisible(false);
                panelStaff.setVisible(false);
                panelStudent.setVisible(true);
                setPanelStudent();
            }
        });

        staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelStart.setVisible(false);
                panelStudent.setVisible(false);
                panelStaff.setVisible(true);
            }
        });
    }

    void setPanelStudent(){
        //Buttons will grow with the screen
        c.weightx=0.5;
        c.insets= new Insets(5,5,5,5);

        //Increases the size to accommodate for more menus
        setSize(300,250);

        JLabel studentYear = new JLabel("Enter student year (1-4)");
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx=0;
        c.gridy=0;
        panelStudent.add(studentYear,c);

        JTextField enterStudentYear = new JTextField(15);
        c.gridx=0;
        c.gridy=1;
        panelStudent.add(enterStudentYear,c);

        JButton confirmStudentInput = new JButton("Confirm");
        c.gridwidth=1;
        c.gridx=1;
        c.gridy=1;
        panelStudent.add(confirmStudentInput,c);

        //Input validation + setting student year
        confirmStudentInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currYear = 0;
                try {
                    currYear = Integer.parseInt(enterStudentYear.getText());
                } catch (Exception f){

                }
                if (currYear > 4 || currYear < 1){
                    JOptionPane.showMessageDialog(null,"Please enter an integer between 1 and 4.");
                }
            }
        });

        JLabel studentName = new JLabel("Enter student name");
        c.gridx=0;
        c.gridy=2;
        panelStudent.add(studentName,c);


        JTextField enterName = new JTextField("",15);
        c.gridx=0;
        c.gridy=3;
        panelStudent.add(enterName,c);

        JLabel studentAddress = new JLabel("Enter student address");
        c.gridx=0;
        c.gridy=4;
        panelStudent.add(studentAddress,c);

        JTextField enterAddress = new JTextField("",15);
        c.gridx=0;
        c.gridy=5;
        panelStudent.add(enterAddress,c);


        add(panelStudent);
    }
}
