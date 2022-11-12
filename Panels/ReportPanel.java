package Panels;

import Classes.Model;

import javax.swing.*;
import java.awt.*;

public class ReportPanel extends JPanel {
    JLabel staffLabel = new JLabel();
    GridBagConstraints c = new GridBagConstraints();

    public ReportPanel(Model model) {
        JList studentList = new JList(model.toStringStudent().toArray());
        setLayout(new GridBagLayout());
        setVisible(true);
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx=0;
        c.gridy=0;
        add(studentList,c);
    }



}
