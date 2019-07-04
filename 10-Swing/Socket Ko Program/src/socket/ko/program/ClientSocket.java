package socket.ko.program;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {

    public static void main(String[] args) {
       final String HOST="localhost";
       final int PORT=2000;
       try{
        Socket echoSocket=new Socket(HOST,PORT);
        PrintWriter out=new PrintWriter(echoSocket.getOutputStream(),true);
        Scanner in= new Scanner(echoSocket.getInputStream());
        Scanner s=new Scanner(System.in);
        
        while(true){
            System.out.println("Radius");
            String input=s.nextLine();
            out.write(input);
            if(input.equalsIgnoreCase("exit"))
                System.exit(0);
            System.out.println("Area "+in.nextLine());
        }
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
    
}
