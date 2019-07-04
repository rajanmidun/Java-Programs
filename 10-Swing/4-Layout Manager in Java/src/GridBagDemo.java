import java.awt.*;

import javax.swing.*;
class Grid extends JFrame{
   private JButton button1,button2,button3,button4;
   
   public Grid() {
	   setLayout(new GridBagLayout());
	   GridBagConstraints c=new GridBagConstraints();
	   
	   button1= new JButton("Rajan");
	  
       c.fill=GridBagConstraints.HORIZONTAL;
       c.ipady=100;
       c.gridx=0;
       c.gridy=0;
       c.weightx=0.5;
       add(button1,c);
       
       button2= new JButton("Midun");
       c.fill=GridBagConstraints.HORIZONTAL;
       c.gridx=1;
       c.gridy=0;
       add(button2,c);
       
       button3= new JButton("Magar");
       c.fill=GridBagConstraints.HORIZONTAL;
       c.gridx=2;
       c.gridy=0;
       add(button3,c);
       
       button4=new JButton("Hello");
       c.fill=GridBagConstraints.HORIZONTAL;
       c.gridx=0;
       c.gridy=1;
       c.gridwidth=3;
       c.ipadx=200;
       add(button4,c);
       
       pack();
   }
	
}
public class GridBagDemo {

	public static void main(String ag[]) {
		Grid grid = new Grid();
		grid.setVisible(true);
		grid.setSize(300,300);
		grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
