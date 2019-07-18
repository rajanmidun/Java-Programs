package server.codes;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ServerCodes {
    
    public static void main(String[] args) throws Exception{
        int PORT=7070;
        ServerSocket serversocket= new ServerSocket(PORT);
        Socket clientsocket= serversocket.accept();
        PrintWriter out= new PrintWriter(clientsocket.getOutputStream(),true);
        Scanner scanner= new Scanner(clientsocket.getInputStream());
        
        while(true){
           String name=scanner.next();
           if(name.equalsIgnoreCase("exit"))
               break;
           else
               out.println(name);
        }
    }
    
}
