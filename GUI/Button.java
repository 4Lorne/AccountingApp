package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {

    Button(String name){
        setVerticalAlignment(AbstractButton.CENTER);
        setBounds(100,100,100,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
