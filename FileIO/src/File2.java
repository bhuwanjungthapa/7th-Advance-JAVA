import java.io.*;

public class File2 {
    public static void main(String[] args){


        try{
            File Obj = new File("exfile.txt");
            if(Obj.createNewFile()){
                System.out.println("File created"+Obj.getName());
            }else {}

            System.out.println("File not created");

            }catch (IOException e){
            System.out.println(e);

        }
        }
    }
