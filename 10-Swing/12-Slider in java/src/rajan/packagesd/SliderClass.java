package rajan.packagesd;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.FlowLayout;

class SliderDemo extends JFrame {
	private JSlider slider1;
	private JLabel label1;

	public SliderDemo() {
		setLayout(new FlowLayout());

		label1 = new JLabel("Slider Value 0");
		add(label1);

		slider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider1.setMajorTickSpacing(5);
		slider1.setPaintTicks(true);
		add(slider1);

		event listener = new event();
		slider1.addChangeListener(listener);

	}

	public class event implements ChangeListener {

		public void stateChanged(ChangeEvent e) {
			try {
				int value = slider1.getValue();
				System.out.println(value);
				label1.setText("Slider Value "+value);
			} catch (Exception ee) {
				System.out.println(ee.getMessage());
			}
		}

	}

}

public class SliderClass {

	public static void main(String[] args) {
		SliderDemo sliderdemo = new SliderDemo();
		sliderdemo.setVisible(true);
		sliderdemo.setSize(200, 200);
		sliderdemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
