import javax.swing.*;
import java.awt.event.*;

public class TextAreaTest extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextArea text;

    TextAreaTest()
    {

        l1 = new JLabel();
        l1.setBounds(45,175,100,30);

        l2 = new JLabel();
        l2.setBounds(150,175,100,30);

        text = new JTextArea();
        text.setBounds(15,20,250,150);

        JButton btn = new JButton("Counting words");
        btn.setBounds(50,210,180,30);
        btn.addActionListener(this);

        add(text);
        add(l1);
        add(l2);
        add(btn);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = text.getText();
        String words[] = str.split("\\s");
        l1.setText("Cords: "+ words.length);
        l2.setText("Character: "+ str.length());
    }

    public static void main(String[] args) {
        new TextAreaTest();
    }
}

