import java.awt.event.*;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class FileChooser {
    public static void main(String[] args)
    {
        JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        //open the filem
        int res = choose.showOpenDialog(null);
        //save the file
        //int res = choose.showSaveDialog(null);
        if(res==JFileChooser.APPROVE_OPTION)
        {
            File file = choose.getSelectedFile();
            JOptionPane.showMessageDialog(null,"The choseen file path is :"+file.getAbsolutePath());
            System.out.println(file.getAbsolutePath());
        }

    }

}
