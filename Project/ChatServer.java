package Project;

import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Server started on port 6000...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
            }

            socket.close();
            serverSocket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}// test change
// test change
// test change
// test change
// test change
// test change
