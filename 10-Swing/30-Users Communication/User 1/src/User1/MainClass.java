
package User1;

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        try{
        System.out.println("user 1");
        final int PORT=3303;
        final String HOST="localhost";
        Socket clientSocket= new Socket(HOST,PORT);
        PrintWriter out= new PrintWriter(clientSocket.getOutputStream(),true);
        Scanner input= new Scanner(clientSocket.getInputStream());
        Scanner in=new Scanner(System.in);
        while(true){
         String message=in.nextLine();
         out.println(message);
         if(message.equalsIgnoreCase("exit"))
             break; 
            System.out.println("Echo "+input.nextLine());
        }
    }
    catch(IOException e){}
        
    }
}
