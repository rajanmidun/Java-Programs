import java.awt.BorderLayout;

import javax.swing.*;

class BorderManagerLayout extends JFrame{
	private JButton pageStart,lineStart,center,lineEnd,pageEnd;
	
	public BorderManagerLayout() {
		setLayout(new BorderLayout());
		
		pageStart= new JButton("PAGE-START");
		add(pageStart,BorderLayout.PAGE_START);
		
		lineStart= new JButton("LINE-START");
		add(lineStart,BorderLayout.LINE_START);
		
		center= new JButton("CENTER");
		add(center,BorderLayout.CENTER);
		
		lineEnd= new JButton("LINE-END");
		add(lineEnd,BorderLayout.LINE_END);
		
		pageEnd= new JButton("PAGE-END");
		add(pageEnd,BorderLayout.PAGE_END);
		
	}
}
public class BorderLayoutDemo {
   public static void main(String args[]) {
	   BorderManagerLayout borderlayout=new BorderManagerLayout();
	   borderlayout.setVisible(true);
	   borderlayout.setSize(200,300);
	   borderlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
}
