
package jdbc;
 import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Insert {
    public void dataUpdate(){
    try{
        String fname,lname;
        int id;
        Scanner scanner=new Scanner(System.in);
        System.out.print("ID ");
        id= scanner.nextInt();
        System.out.print("Firstname ");
        fname= scanner.next();
        System.out.print("Lastname ");
        lname= scanner.next();
        String url="jdbc:mysql://localhost:3306/rajan";
        String username="root";
        String password="";
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String sql=String.format("Insert into admin (id,Firstname,Lastname) values(%d,'%s','%s')",id,fname,lname);
        int rows =statement.executeUpdate(sql);
        if(rows>0)
            System.out.println("Record saved");
        else
            System.out.println("Data is not inserted");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
