import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.*;

public class InputFromClient extends JFrame implements ActionListener {
    JLabel lblnum1, lblnum2, lblresult;
    JTextField txtnum1, txtnum2, txtresult;
    JButton btnadd;
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public InputFromClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            input = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            setLayout(null);
            lblnum1 = new JLabel("Enter num1");
            lblnum2 = new JLabel("Enter num2");
            lblresult = new JLabel("Result(SUM)");

            txtnum1 = new JTextField();
            txtnum2 = new JTextField();
            txtresult = new JTextField();
            txtresult.setEditable(false); // disable editing of the result field

            btnadd = new JButton("Add");

            add(lblnum1);
            lblnum1.setBounds(50, 50, 100, 25);
            add(txtnum1);
            txtnum1.setBounds(150, 50, 100, 25);
            add(lblnum2);
            lblnum2.setBounds(50, 100, 100, 25);
            add(txtnum2);
            txtnum2.setBounds(150, 100, 100, 25);
            add(btnadd);
            btnadd.addActionListener(this);
            btnadd.setBounds(150, 150, 75, 25);
            add(lblresult);
            lblresult.setBounds(50, 200, 100, 25);
            add(txtresult);
            txtresult.setBounds(150, 200, 100, 25);

            setSize(300, 300);
            setVisible(true);
            setResizable(false);
            setTitle("Addition");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } catch (IOException I) {
            System.out.println(I);
        }
    }

    public static void main(String args[]) {
        new InputFromClient("127.0.0.1", 8000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnadd) {
            double num1 = Double.parseDouble(txtnum1.getText());
            double num2 = Double.parseDouble(txtnum2.getText());
            try {
                out.writeDouble(num1);
                out.writeDouble(num2);
                double result = input.readDouble();
                txtresult.setText(Double.toString(result));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


