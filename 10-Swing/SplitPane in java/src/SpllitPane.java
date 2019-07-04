import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

class SplitPane extends JFrame {
	String[] colorNames = { "red", "green", "yellow", "black" };
	Color[] colors = { Color.RED, Color.GREEN, Color.YELLOW, Color.BLACK };
	JComboBox box;
	private JPanel panelLeft, panelRight;
	JSplitPane pane;

	public SplitPane() {
		setLayout(new FlowLayout());
		panelLeft = new JPanel();
		box = new JComboBox(colorNames);
		panelLeft.add(box);

		panelRight = new JPanel();
		panelRight.setPreferredSize(new Dimension(200, 200));

		pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelLeft, panelRight);
		pane.setOneTouchExpandable(true);
		pane.setDividerLocation(550);
		add(pane, BorderLayout.CENTER);

		box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Color color = colors[box.getSelectedIndex()];
				panelRight.setBackground(color);
			}
		});
		
		pack();
	}
}

public class SpllitPane {

	public static void main(String[] args) {
		SplitPane splitpane = new SplitPane();
		splitpane.setVisible(true);
//		splitpane.setSize(300, 300);
		splitpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
