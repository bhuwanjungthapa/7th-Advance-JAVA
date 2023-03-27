import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerResult {
    private Socket socket = null;
    private ServerSocket server=null;
    public ServerResult(int port) {
        try {
            System.out.println("Server started, Waiting for Clients...");
            while (true) {

                server = new ServerSocket(port);
                socket = server.accept();


                System.out.println("Client connected: " );
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                double num1 = input.readDouble();
                double num2 = input.readDouble();
                double result = num1 + num2;
                System.out.println("The result is: "+result);

                out.writeDouble(result);

                socket.close();
                System.out.println("Client disconnected: ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public static void main(String[] args) {
            ServerResult server = new ServerResult(8000);


        }
}
