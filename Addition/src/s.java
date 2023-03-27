import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class s {


    public s(int port) throws IOException {
        while(true){
        ServerSocket server = new ServerSocket(port);
        Socket socket = server.accept();

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        double num1= in.readDouble();
        double num2= in.readDouble();
        out.writeDouble(num1+num2);
        socket.close();
    }}
    public static void main(String args[]) throws IOException { new s(8000);
    }
}
