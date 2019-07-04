package socket.ko.program;

import java.io.File;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) {
        System.out.println("Waiting for connection....");
        final int PORT = 2000;
        try {
            ServerSocket serversocket = new ServerSocket(PORT);
            Socket clientsocket = serversocket.accept();
            PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
            Scanner in = new Scanner(clientsocket.getInputStream());
            while (true) {
                System.out.println("Client connected");
                String input = "";
                double radius = 0.0;
                input = in.nextLine();
                radius = Double.parseDouble(input);
                double area = Math.PI * radius * radius;
                if (input.equalsIgnoreCase("exit")) {
                    System.exit(0);
                }
                out.println(String.valueOf(area));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
