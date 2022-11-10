package GUI;

import javax.swing.*;
import java.awt.*;

public class StaffPanel extends JPanel {
    //Variables
    String staffName;
    String staffAddress;
    int yearsOfService;

    //Constraints for GridBag
    GridBagConstraints c = new GridBagConstraints();

    StaffPanel(){
        setLayout(new GridBagLayout());
        setVisible(false);

        //Buttons will grow with the screen
        c.weightx=0.5;
        c.insets= new Insets(5,5,5,5);

        JLabel staffName = new JLabel("Enter staff name");
        c.anchor = GridBagConstraints.LINE_START;
        c.gridx=0;
        c.gridy=0;
        add(staffName,c);

        JTextField enterStaffName = new JTextField(15);
        c.gridx=0;
        c.gridy=1;
        add(enterStaffName,c);

        JButton confirmStaffName = new JButton("Confirm");
        c.gridwidth=1;
        c.gridx=1;
        c.gridy=1;
        add(confirmStaffName,c);

        confirmStaffName.addActionListener(e -> {
            try {
                StaffPanel.this.staffName = enterStaffName.getText();
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterStaffName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
            }
        });


        JLabel staffAddress = new JLabel("Enter staff address");
        c.gridx=0;
        c.gridy=2;
        add(staffAddress,c);

        JTextField enterStaffAddress = new JTextField(15);
        c.gridx=0;
        c.gridy=3;
        add(enterStaffAddress,c);

        JButton confirmStaffAddress = new JButton("Confirm");
        c.gridwidth=1;
        c.gridx=1;
        c.gridy=3;
        add(confirmStaffAddress,c);

        confirmStaffAddress.addActionListener(e -> {
            try {
                StaffPanel.this.staffAddress = enterStaffAddress.getText();
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterStaffAddress.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter valid information.");
            }
        });


        JLabel yearsOfService = new JLabel("Enter staff years of service");
        c.gridx=0;
        c.gridy=4;
        add(yearsOfService,c);

        JTextField enterStaffYearsOfService = new JTextField(15);
        c.gridx=0;
        c.gridy=5;
        add(enterStaffYearsOfService,c);

        JButton confirmStaffYearsOfService = new JButton("Confirm");
        c.gridwidth=1;
        c.gridx=1;
        c.gridy=5;
        add(confirmStaffYearsOfService,c);

        confirmStaffYearsOfService.addActionListener(e -> {
            try {
                StaffPanel.this.yearsOfService = Integer.parseInt(enterStaffYearsOfService.getText());
            } catch (Exception f){
                f.printStackTrace();
            }
            if (enterStaffYearsOfService.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter a number.");
            } else if (StaffPanel.this.yearsOfService < 1 || StaffPanel.this.yearsOfService > 30){
                JOptionPane.showMessageDialog(null,"Please enter an integer between 1 and 4.");
            }
        });

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
