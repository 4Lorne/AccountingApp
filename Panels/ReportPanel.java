package Panels;

import Classes.Model;

import javax.swing.*;
import java.awt.*;

public class ReportPanel extends JPanel {
    JLabel studentLabel = new JLabel();
    JLabel staffLabel = new JLabel();
    GridBagConstraints c = new GridBagConstraints();

    Model model = new Model();
    public ReportPanel(Model model) {
        setLayout(new GridBagLayout());
        setVisible(true);
        c.insets = new Insets(5, 5, 5, 5);
        studentLabel.setText(model.toStringStudent());
        add(studentLabel);
    }

}
