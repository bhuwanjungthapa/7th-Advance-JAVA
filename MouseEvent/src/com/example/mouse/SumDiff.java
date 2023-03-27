
package com.example.mouse;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class SumDiff extends JFrame  implements MouseListener {

    JTextField num1, num2;

    JLabel inp1, inp2, output;

    public SumDiff()
    {
        //JFrame frame = new JFrame("Sum and Difference");
        //  setLayout(null);

        inp1 = new JLabel("First Number");
        inp1.setBounds(20,10,100,20);
        num1 = new JTextField(10);
        num1.setBounds(120, 10, 100, 20);

        inp2 = new JLabel("Second Number");
        inp2.setBounds(20,40,100,20);
        num2 = new JTextField(10);
        num2.setBounds(120,40,100,20);

        output = new JLabel();
        output.setBounds(20,70,200,20);

        add(inp1);
        add(inp2);
        add(num1);
        add(num2);
        add(output);

        output.addMouseListener(this);

        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Not used
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == output) {
        int num1 = Integer.parseInt(this.num1.getText());
        int num2 = Integer.parseInt(this.num2.getText());
        int diff = num1 - num2;
        output.setText("Difference: " + diff);
    }}

    @Override
    public void mouseReleased(MouseEvent e) {

        int num1 = Integer.parseInt(this.num1.getText());
        int num2 = Integer.parseInt(this.num2.getText());
        int sum = num1 + num2;
        output.setText("Sum: " + sum);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not used
    }

    public static void main(String[] args){
        new SumDiff();
    }
}