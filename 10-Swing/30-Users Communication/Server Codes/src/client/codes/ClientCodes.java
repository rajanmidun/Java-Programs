package client.codes;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientCodes {
    
    public static void main(String[] args) throws Exception{
        int PORT=7070;
        String HOST="localhost";
        Socket clientsocket= new Socket(HOST,PORT);
        PrintWriter out= new PrintWriter(clientsocket.getOutputStream(),true);
        Scanner scanner= new Scanner(clientsocket.getInputStream());
        Scanner in= new Scanner(System.in);
        while(true){
           System.out.println("Enter you name");
           String name=in.nextLine();
           out.println(name);
           if(name.equalsIgnoreCase("exit"))
               break;
           else
                System.out.println("Echo: "+scanner.nextLine());
               
        }
    }
    
}
