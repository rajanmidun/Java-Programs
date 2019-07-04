import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class second extends JPanel{

	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    this.setBackground(Color.RED);
	    
	    g.setColor(Color.WHITE);
	    g.fillRect(25, 25, 50, 34);
	}
}
