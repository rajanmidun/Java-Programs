import java.awt.FlowLayout;

import javax.swing.*;

class Table extends JFrame {
	String[] columnNames = { "First Name", "Last Name", "Sport", "# of Years", "Vegetarian" };
	Object[][] data = { { "Kathy", "Smith", "Snowboarding", 5, false }, { "John", "Doe", "Rowing", 3, true },
			{ "Sue", "Black", "Knitting", 2, false }, { "Jane", "White", "Speed reading", 20, true },
			{ "Joe", "Brown", "Pool", 10, false } };

	public Table() {
		setLayout(new FlowLayout());
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}

}

public class MainClass {

	public static void main(String[] args) {
     Table table= new Table();
     table.setVisible(true);
     table.setSize(300,300);
     table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
