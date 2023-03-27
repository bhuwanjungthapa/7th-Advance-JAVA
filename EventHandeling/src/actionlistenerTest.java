import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class actionlistenerTest extends Frame implements ActionListener {

    Label lbluser, lblpass;
    TextField txtuser, txtpass;
    Button btnlogin;

    public  actionlistenerTest(){
//            setLayout(new FlowLayout());// puts default coordinate
        setLayout(null);

        lbluser = new Label("Username");
        lblpass = new Label("Password");

        txtuser = new TextField();
        txtpass = new TextField();

        btnlogin = new Button("Login");

        add(lbluser);
        lbluser.setBounds(20,50,100,20); // manual positioning of components with setBounds
        add(txtuser);
        txtuser.setBounds(120,50,100,20);
        add(lblpass);
        lblpass.setBounds(20,80,100,20);
        add(txtpass);
        txtpass.setBounds(120,80,100,20);
        add(btnlogin);
        btnlogin.addActionListener(this);
        btnlogin.setBounds(100,110,70,50);
        setSize(300, 200);  //size of the frame
        setVisible(true);  //visibility of the frame
        setResizable(false);  //cannot resize the frame
        setTitle("Login");  //title of the frame
//            setLocation(400,300); //open frame at that point in your screen
        setLocationRelativeTo(null);// put to center of screen

    }


    public static void main(String[] args) {
        new actionlistenerTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String uname = "Tony";
        String upass = "Stark";

        if((uname.equals(txtuser.getText().toString()))&&(upass.equals(txtpass.getText().toString()))){
            JOptionPane.showConfirmDialog(null,"login Success");
        }else{
            JOptionPane.showConfirmDialog(null,"login Fail");
        }
    }
}
