import java.io.IOException;
import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("exfile.txt");
            Writer.write("hello java");
                Writer.close();
            System.out.println("Successfully written");

        }catch (IOException e){
            System.out.println(e);

        }
    }
    }
