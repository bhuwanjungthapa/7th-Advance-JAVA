import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JLabel lbluser,lblpass;
    JTextField txtuser;
    JPasswordField txtpass;
    JButton btnlogin;
    JButton btnnew;

    DBConnection dbc;
    PreparedStatement pstmt;
    ResultSet rs;
    public Login(){
        dbc = new DBConnection();
        //setLayout(new FlowLayout());
        setLayout(null);

        lbluser=new JLabel("Username");
        lblpass=new JLabel("Password");
        txtuser= new JTextField(20);
        txtpass= new JPasswordField(20);
        btnlogin=new JButton("Login");
        btnnew = new JButton("New user");
        add(lbluser);
        lbluser.setBounds(50,50,100,25);//component positioning
        add(txtuser);

        txtuser.setBounds(150,50,100,25);
        add(lblpass);
        lblpass.setBounds(50,75,100,25);
        add(txtpass);
        txtpass.setBounds(150,75,100,25);
        add(btnlogin);
        btnlogin.addActionListener(this);
        btnlogin.setBounds(55,110,100,25);
        setSize(300,200);
        add(btnnew);
        btnnew.addActionListener(this);
        btnnew.setBounds(150,110,100,25);
        setVisible(true);
        setResizable(false);//cant resize frame
        setTitle("Student Login Page");//sets title of page
        setLocation(450,400);//locates the frame

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        setDefaultLookAndFeelDecorated(true);
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String uname="Tony";
//        String pwd="Stark";
//        if((uname.equals(txtuser.getText().toString()))&&(pwd.equals(txtpass.getText().toString()))){
////            JOptionPane.showConfirmDialog(null, "Login Success");
//            new MainForm();
//
//        }else{
//            JOptionPane.showConfirmDialog(null, "Login Failed");
//        }

        if(e.getSource()==btnlogin){
            try{
            pstmt = dbc.con.prepareStatement("select * from login where username=? and password=?");
                    pstmt.setString(1,txtuser.getText());
                pstmt.setString(2,txtpass.getText());

                rs = pstmt.executeQuery();
                if (rs.next()){
                    System.out.println("Login Success");
                    new MainForm();
                    JOptionPane.showMessageDialog(null, "Login Success");

                }else {
                    System.out.println("Login fail");
                    JOptionPane.showMessageDialog(null, "Login Fail");

                }

            }catch (Exception ex1){
                ex1.printStackTrace();

            }
        }
        if(e.getSource()==btnnew){
            try{
                pstmt = dbc.con.prepareStatement("insert into login(username,password) values(?,?)");
                pstmt.setString(1,txtuser.getText());
                pstmt.setString(2,txtpass.getText());
               int result =   pstmt.executeUpdate();

               if(result>0){
                   JOptionPane.showMessageDialog(null,"Record save successfully");
               }else {
                   JOptionPane.showMessageDialog(null,"Unable to create user");

               }


            }catch (Exception ex2){
                ex2.printStackTrace();
            }
        }

    }
}