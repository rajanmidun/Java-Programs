import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class second extends JFrame{

	private String[] names= {"rajan","kaka","daka","magar","shtam","suraj"};
	private JList left;
	private JList right;
	private JButton but;
	
	public second()
	{
		super("Multiple select");
		setLayout(new FlowLayout());
		
		left= new JList(names);
		left.setVisibleRowCount(2);
		left.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(left));
		
		but = new JButton("click me-->");
		but.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
					right.setListData(left.getSelectedValues());	
					}
				}
				);
		add(but);
		right=new JList();
		right.setVisibleRowCount(4);
		right.setFixedCellHeight(34);
		right.setFixedCellWidth(34);
		right.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(right));
		
		
		
	}
}
