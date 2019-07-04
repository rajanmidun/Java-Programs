package creating.a.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jframe extends JFrame {

    private JLabel label1, label2, label3;
    private JButton sum;
    private JTextField textfield1, textfield2, textfield3;

    public jframe() {
        super("Sum of two number in JFrame");
        setLayout(new GridLayout(4,2));

        label1 = new JLabel("Enter the first number\n", JLabel.CENTER);
        add(label1);
        textfield1 = new JTextField(3);
        add(textfield1);

        label2 = new JLabel("Enter the second number\n", JLabel.CENTER);
        add(label2);
        textfield2 = new JTextField(5);
        add(textfield2);

        sum = new JButton("Sum");
        add(sum);
        textfield3 = new JTextField(5);
        add(textfield3);
        textfield3.setEditable(false);

       

        sum.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double fnumber= Double.parseDouble(textfield1.getText());
                double snumber= Double.parseDouble(textfield2.getText());
               double sum= fnumber+snumber;
               textfield3.setText(String.valueOf(sum));
            }

        });
    }

}
