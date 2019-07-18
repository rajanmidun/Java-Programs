package email.sending;

import java.io.*;
import java.net.*;
import java.util.Scanner;

class Email{
    private String from,to,message="";
    private final String SMTP_HOST="smtp.vianet.com.np";
    private final int SMTP_PORT=25;
    private Scanner in=null;
    private PrintWriter out= null;
    
    public Email(String from, String to, String message){
        this.from= from;
        this.to=to;
        this.message=message;
    }
    public void send() throws IOException{
       Socket socket= new Socket(SMTP_HOST,SMTP_PORT);
       in=new Scanner(socket.getInputStream());
       out=new PrintWriter(socket.getOutputStream(),true);
       String hostname=InetAddress.getLocalHost().getHostName();
       receive();
       send("Hello "+hostname);
       receive();
       send("Mail From:< "+from+" >");
       receive();
       send("Rcp To:< "+to+" >");
       receive();
       send("Data");
       receive();
       send(message);
       send(".");
       receive();
       socket.close();
    }
    private void receive() throws IOException{
        String line=in.nextLine();
        System.out.println(" "+line);
    }
    private void send(String s) throws IOException{
        System.out.println(">> "+s);
        out.print(s.replaceAll("\n", "\r\n"));
        out.print("\r\n");
        out.flush();
    }
}
public class EmailSending {

    
    public static void main(String[] args) throws IOException {
        Email email=new Email("rajan.midun1@gmail.com",
                    "rajan20540723@gmail.com",
                     "Hello rajan");
        email.send();
    }
    
}
