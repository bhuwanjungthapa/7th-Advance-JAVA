import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu mnuro,mnure,mnuhlp; //menus

    JMenuItem miadd, miedit,midel,miexitt;

    JMenuItem miall,miindv;

    JMenuItem miabt;

    //creating menubar constrrutcot
    public MainForm(){
        mb =new JMenuBar();

        mnuro= new JMenu("Record Operation");
        mnure = new JMenu("Report");
        mnuhlp =new JMenu("Help");

        miadd = new JMenuItem("Add new Record");
        miedit = new JMenuItem("Modify");
        midel = new JMenuItem("Delete");
        miexitt = new JMenuItem("Exit");

        miall = new JMenuItem("All");
        miindv = new JMenuItem("Report");
        miabt = new JMenuItem("About");

        setJMenuBar(mb);

        //Add menus to menubar
        mb.add(mnuro);
        mb.add(mnuhlp);
        mb.add(mnure);

        //Add item
        mnuro.add(miadd);
        miadd.addActionListener(this);
        mnuro.add(miedit);
        mnuro.add(midel);
        mnuro.add(miedit);

        //Report
        mnure.add(miall);
        mnure.add(miindv);

        //Helip
        mnure.add(miabt);

        setVisible(true);
        setSize(500,500);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miadd){
            new AddRecord();
        }
    }
}
