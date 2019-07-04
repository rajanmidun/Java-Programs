package jdbc;

import java.sql.*;

public class Update {

    public void updateData() {
        try {
            String url="jdbc:mysql://localhost:3306/rajan";
            String username="root";
            String password="";
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            String sql="Update admin set Firstname='Pawan',Lastname='Thapa' where id=4";
            int rows =statement.executeUpdate(sql); 
            if(rows>0)
                System.out.println("Record updated");
            else
                System.out.println("Not update");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}