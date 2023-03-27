import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


//HOW TO USE COMBO BOX
public class AddRecord extends JFrame  implements ActionListener{

    JLabel lblroll,lblname,lbllevel,lblfc,lelsem;

    JTextField txtroll,txtname;

    JComboBox cblevel,cbfc,cbsem;

    JButton btnsave;

    PreparedStatement pstmt;
   DBConnection dbc;

    public AddRecord(){
        dbc = new DBConnection();

        setLayout(null);
        setVisible(true);
        setSize(500,500);

        lblroll = new JLabel("Roll no.");
        lblname = new JLabel("Name");
        lbllevel = new JLabel("Level");
        lblfc = new JLabel("Faculty");
        lelsem = new JLabel("Semester");

        txtname = new JTextField();
        txtroll = new JTextField();



        //combobox level
        cblevel = new JComboBox();
        cblevel.addItem("+2");;
        cblevel.addItem("Bachelor");
        cblevel.addItem("Master");


        cbfc = new JComboBox();
        cbfc.addItem("Science");
        cbfc.addItem("HM");
        cbfc.addItem("Bussiness");

        cbsem = new JComboBox();
        cbsem.addItem("First");
        cbsem.addItem("Second");
        cbsem.addItem("Third");
        cbsem.addItem("Fourth");

        btnsave = new JButton("Save");
        btnsave.addActionListener(this);

        add(lblname);
        lblname.setBounds(50,50,100,25);
        add(txtname);
        txtname.setBounds(150,50,100,25);


        add(lblroll);
        lblroll.setBounds(50,70,100,25);
        add(txtroll);
        txtroll.setBounds(150,70,100,25);

        add(lbllevel);
        lbllevel.setBounds(50,90,100,25);
        add(cblevel);
        cblevel.setBounds(150,90,100,25);

        add(lblfc);
        lblfc.setBounds(50,110,100,25);
        add(cbfc);
        cbfc.setBounds(150,110,100,25);

        add(lelsem);
        lelsem.setBounds(50,130,100,25);
        add(cbsem);
        cbsem.setBounds(150,130,100,25);

        add(btnsave);
        btnsave.setBounds(90,150,100,25);



    }
    public static void main(String[] args) {

        new AddRecord();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnsave){
            try{
                pstmt = dbc.con.prepareStatement("insert into studentdb(roll_no,full_name,levels,faculty,semester) values(?,?,?,?,?)");
                pstmt.setString(2,lblroll.getText());
                pstmt.setString(2,lblname.getText());

                pstmt.setString(1,cblevel.getSelectedItem().toString());
                pstmt.setString(1,cbfc.getSelectedItem().toString());
                pstmt.setString(1,cbsem.getSelectedItem().toString());


                int result =   pstmt.executeUpdate();

                if(result>0){
                    JOptionPane.showMessageDialog(null,"Record save successfully");
                }else {
                    JOptionPane.showMessageDialog(null,"Unable to create user");

                }


            }catch (Exception ex3){
                ex3.printStackTrace();
            }
        }

    }
}
