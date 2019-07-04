import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Demo extends JFrame {
	private JButton chooseButton;
	private Color color = Color.WHITE;
	private JPanel panel;

	public Demo() {
		setLayout(new FlowLayout());
		panel = new JPanel();
		panel.setBackground(color);

		chooseButton = new JButton("Choose a color");
		

		chooseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               color=JColorChooser.showDialog(null, "Pick your color", color);
               if(color==null)
            	   color=Color.WHITE;
               
               panel.setBackground(color);
			}
		});
		
		add(panel,BorderLayout.CENTER);
		add(chooseButton);
		setSize(435,345);
	}
}

public class ChooserDemo {
	public static void main(String args[]) {
     Demo demo= new Demo();
     demo.setVisible(true);
     demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
