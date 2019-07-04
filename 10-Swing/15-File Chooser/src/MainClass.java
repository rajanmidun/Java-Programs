import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

class FileChooser extends JFrame {
	private JFileChooser filechooser;
	private JButton selectButton;
	private JLabel label1;

	public FileChooser() {
		setLayout(new FlowLayout());
		label1= new JLabel("You choose...");
		add(label1);

		selectButton = new JButton("Choose a file");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filechooser = new JFileChooser("");
				filechooser.showOpenDialog(null);
				File f= filechooser.getSelectedFile();
				String path=f.getAbsolutePath();
				label1.setText(path);				
			}
		});
		add(selectButton);
	}

}

public class MainClass {
	public static void main(String arg[]) {
		FileChooser chooser = new FileChooser();
		chooser.setVisible(true);
		chooser.setSize(400, 400);
		chooser.setResizable(false);
		chooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
