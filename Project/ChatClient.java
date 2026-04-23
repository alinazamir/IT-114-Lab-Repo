package Project;

import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6000);
            System.out.println("Connected to server!");

            BufferedReader console = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true
            );

            String userInput;
            while ((userInput = console.readLine()) != null) {
                out.println(userInput);
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}