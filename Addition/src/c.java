import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class c {

   public c( String address, int port) throws IOException {
       double num1= 2;
       double num2= 2;
       Socket socket = new Socket(address,port);
       DataOutputStream out = new DataOutputStream(socket.getOutputStream());
       DataInputStream in = new DataInputStream(socket.getInputStream());
       out.writeDouble(num1);
       out.writeDouble(num2);
       double num3 = in.readDouble();
       System.out.println(num3);
    }
    public static void main(String args[]) throws IOException {
        new c("127.0.0.1", 8000);
    }


}
