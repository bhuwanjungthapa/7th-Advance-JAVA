import java.io.File;
import java.util.Scanner;

public class ReadFileByScanner {
    public static void main(String[] args) {
        try{
            File Obj=new File("exfile.txt");

            Scanner Reader=new Scanner(Obj);
            while(Reader.hasNextLine()){
                System.out.println(Reader.nextLine());
            }
            Reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}