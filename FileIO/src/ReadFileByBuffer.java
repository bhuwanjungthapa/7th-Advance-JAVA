
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileByBuffer {
    public static void main(String[] args) throws IOException {
        try{
            File file=new File("exfile.txt");

            BufferedReader br=new BufferedReader( new FileReader(file));
            String data="";
            while((data=br.readLine())!=null){

                System.out.println(data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}