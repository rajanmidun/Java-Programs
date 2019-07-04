import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class second extends JFrame{
	private JComboBox list;
	private JLabel pictures;
	
	public static String[] filename= {"b.jpeg","a.png"};
	public Icon[] pics= {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
	
	second()
	{
		super("JRadioButton");
		setLayout(new FlowLayout());
		
		list =new JComboBox(filename);
		add(list);
		pictures= new JLabel(pics[0]);
		thehandler handler= new thehandler();
		list.addItemListener(handler);
	}
	private class thehandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			if(event.getStateChange()==ItemEvent.SELECTED)
				pictures.setIcon(pics[list.getSelectedIndex()]);
			    add(pictures);
		}
		
		
		
	}
	
}
