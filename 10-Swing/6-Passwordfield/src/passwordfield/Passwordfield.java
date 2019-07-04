
package passwordfield;
import java.awt.GridLayout;
import javax.swing.*;
class First extends JFrame{
private JPasswordField passwordField1;
private JTextField textField1;
private JLabel label1,label2;
private JButton submitButton,resetButton;

public First(){
super("Password Demo");
setLayout(new GridLayout(3,2));

label1= new JLabel("Username");
add(label1);

textField1= new JTextField(10);
add(textField1);

label2= new JLabel("Password");
add(label2);

passwordField1= new JPasswordField(10);
add(passwordField1);

submitButton= new JButton("Submit");
add(submitButton);
resetButton= new JButton("Reset");
add(resetButton);

}
}

public class Passwordfield {

    
    public static void main(String[] args) {
       First first= new First();
       first.setVisible(true);
       first.setSize(300,200);
       first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
