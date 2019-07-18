package ServerCode;

import java.io.*;
import java.net.*;
import java.util.Scanner;
class ClientHandler1 implements Runnable {
    Socket clientSocket;
    public ClientHandler1(Socket clientSocket){
    this.clientSocket=clientSocket;
    }
    public void run(){ 
       try{
        thehandler();   
       }
       catch(Exception e){}
    }
    public void thehandler() throws IOException{
    try{
    PrintWriter out= new PrintWriter(clientSocket.getOutputStream(),true);
    Scanner in= new Scanner(clientSocket.getInputStream());
    while(in.hasNextLine()){
    String input = in.nextLine(); 
    if(input.equalsIgnoreCase("exit"))
        break; 
    out.println(input);
    }
    }
    catch(Exception e){  }
    }
    
}
public class ServerMain {
    public static void main(String args[]){
       final int PORT=3303;
       try{
         ServerSocket serverSocket= new ServerSocket(PORT);
         while(true){
         Socket clientSocket= serverSocket.accept();
         Thread t1= new Thread(new ClientHandler1(clientSocket));
         t1.start();
         Thread t2= new Thread(new ClientHandler1(clientSocket));
         t2.start();
         }
       }
       catch(Exception e){}
       
    }
}
