package insert.and.delete.record;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

class InsertandDelete extends JFrame {

    private JButton insertButton, deleteButton;
    private JLabel rollLabel, nameLabel, addressLabel, phoneLabel;
    private JTextField rollField, nameField, addressField, phoneField;

    public InsertandDelete() {
        setLayout(new GridLayout(5, 2));

        rollLabel = new JLabel("Roll NO");
        add(rollLabel);
        rollField = new JTextField();
        add(rollField);

        nameLabel = new JLabel("Name");
        add(nameLabel);
        nameField = new JTextField();
        add(nameField);

        addressLabel = new JLabel("Address");
        add(addressLabel);
        addressField = new JTextField();
        add(addressField);

        phoneLabel = new JLabel("Phone No");
        add(phoneLabel);
        phoneField = new JTextField();
        add(phoneField);

        insertButton = new JButton("Insert");
        insertButton.addActionListener(new event());
        add(insertButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new event());
        add(deleteButton);
    }
    class event implements ActionListener{
    public void actionPerformed(ActionEvent e){
        int rollNo=Integer.parseInt(rollField.getText());
        String name=nameField.getText();
        String address=addressField.getText();
        String phone=phoneField.getText();
        String url="jdbc:mysql:/localhost:3306/rajan";
        String username="locahost";
        String password="";
        try{
        Connection connection=DriverManager.getConnection(url, username, password);
        Statement statement= connection.createStatement();
        if(e.getSource()==insertButton){
            String sql=String.format("insert into college(roll,name,address,phone) "
                    + "values(%d,'%s','%s','%s')",rollNo,name,address,phone);
            int rowsAffected=statement.executeUpdate(sql);
            if(rowsAffected>0)
                System.out.println("Data inserted");
            else
                System.out.println("Error !!");
        }
        else
            System.out.println("Delete");
        }
        catch(SQLException ee){}
    }
}
    
}



public class InsertAndDeleteRecord{

    public static void main(String[] args) {
        InsertandDelete insertAndDelete = new InsertandDelete();
        insertAndDelete.setSize(400, 400);
        insertAndDelete.setVisible(true);
        insertAndDelete.setLocationRelativeTo(null);
        insertAndDelete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
