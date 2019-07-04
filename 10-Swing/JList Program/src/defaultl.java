import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class defaultl extends JFrame{
	private JList list;
	public static String[] colors= {"red","green","yellow","blue"};
	public static Color[] colorr= {Color.RED,Color.GREEN,Color.YELLOW,Color.BLUE};
	
	public defaultl()
	{
		super("JList");
		setLayout(new FlowLayout());
		
		list=new JList(colors);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				    new ListSelectionListener()
				    {
				    	public void valueChanged(ListSelectionEvent event)
				    	{
				    		getContentPane().setBackground(colorr[list.getSelectedIndex()]);
				    	}
				    }
				);
	}

}
