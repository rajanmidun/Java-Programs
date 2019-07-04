import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.*;

class GridLayoutt extends JFrame{
	private JButton clearButton,submitButton;
	private JLabel usernameLabel,passwordLabel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	
	public GridLayoutt() {
		setLayout(new GridLayout(3,2));
		
		usernameLabel= new JLabel("Username",JLabel.CENTER);
		usernameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
		add(usernameLabel);
		usernameTextField= new JTextField();
		add(usernameTextField);
		
		passwordLabel= new JLabel("Password",JLabel.CENTER);
		add(passwordLabel);
		passwordField= new JPasswordField();
		add(passwordField);
		
		
		clearButton= new JButton("CLEAR");
		add(clearButton);
		submitButton= new JButton("SUBMIT");
		add(submitButton);	
			
	}
}
public class GridLayoutDemo {

	public static void main(String[] args) {
		GridLayoutt gridLayout= new GridLayoutt();
		gridLayout.setVisible(true);
		gridLayout.setSize(300,200);
		gridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
