import java.awt.*;
import javax.swing.*;

class GroupButtonD extends JFrame{
	private JButton b1,b2,b3,b4;
	
	
	public GroupButtonD() {
		GroupLayout layout= new GroupLayout(getContentPane());
		setLayout(layout);
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(b1)
				.addComponent(b2)
				.addGroup(layout.createParallelGroup().addComponent(b3).addComponent(b4)));
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(b1)
						.addComponent(b2)
						.addComponent(b3)
						.addComponent(b4)));
			
	}
}
public class GroupButtonn {
public static void main(String args[]) {
	GroupButtonD groupbutton= new GroupButtonD();
	groupbutton.setVisible(true);
	groupbutton.setSize(300,200);
	groupbutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
