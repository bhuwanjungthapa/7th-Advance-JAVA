package MailServer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionCommandExample implements ActionListener {
    private JFrame frame;
    private JButton button;

    public ActionCommandExample() {
        frame = new JFrame("Action Command Example");
        button = new JButton("Click Me");
        button.setActionCommand("buttonClick");
        button.addActionListener(this);
        frame.add(button, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("buttonClick")) {
            JOptionPane.showMessageDialog(frame, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new ActionCommandExample();
    }
}
