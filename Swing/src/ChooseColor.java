import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ChooseColor extends JFrame implements ActionListener {
    JButton btn;
    public ChooseColor()
    {
        setLayout(new FlowLayout());
         btn = new JButton("Color");
        add(btn);
        btn.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color init = Color.BLUE;
        Color coleur = JColorChooser.showDialog(this,"Choose a color",init);
        btn.setForeground(coleur);
    }
    public static void main(String[] args)
    {
        ChooseColor frame =new ChooseColor();
    }
}
