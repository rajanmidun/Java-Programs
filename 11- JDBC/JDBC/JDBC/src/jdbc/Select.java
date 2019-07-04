package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
    public void dataFetch(){
    try{
        String url="jdbc:mysql://localhost:3306/rajan";
        String username="root";
        String password="";
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        String sql="select * from admin";
        ResultSet resultset=statement.executeQuery(sql);
        while(resultset.next()){
          System.out.printf("%d %s  %s\n",
                  resultset.getInt("id"),
                  resultset.getString("Firstname"),
                  resultset.getString("Lastname"));
        }
    }
    catch(Exception e){}
}
}
