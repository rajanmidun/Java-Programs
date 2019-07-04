package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/rajan";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "Delete from admin where id=4";
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Record Deleted");
            } else {
                System.out.println("Not Deleted");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
