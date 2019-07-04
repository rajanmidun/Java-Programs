package jtextfield;
import javax.swing.*;
import java.awt.*;
public class NewClass extends JFrame{
 
    private  JTextField jTextField;
   private JPasswordField password;
    private JLabel jLabel1,jLabel2;
   
    public NewClass(){
    setLayout(new GridLayout(2,2));
    jLabel1= new JLabel("Enter usernname");
    add(jLabel1);
    JTextField jTextField=new JTextField();
    add(jTextField);
    jLabel2= new JLabel("Enter Password");
    add(jLabel2);
    password =new JPasswordField();
    add(password);
    }

}
