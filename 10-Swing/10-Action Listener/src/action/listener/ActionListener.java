package action.listener;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

class First extends JFrame {

    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel label1, label2;
    private JButton sumButton, subtractButton;

    public First() {
        super("Password Demo");
        setLayout(new GridLayout(3, 2));

        label1 = new JLabel("FirstNumber", JLabel.CENTER);
        add(label1);

        textField1 = new JTextField(10);
        add(textField1);

        label2 = new JLabel("SecondNumber", JLabel.CENTER);
        add(label2);

        passwordField1 = new JPasswordField(10);
        add(passwordField1);

        sumButton = new JButton("Sum");
        add(sumButton);
        subtractButton = new JButton("Subtract");
        add(subtractButton);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (both.isSelected()) {
                    label1.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 34));
                } else if (italic.isSelected()) {
                    label1.setFont(new Font(Font.SERIF, Font.ITALIC, 34));
                } else if (bold.isSelected()) {
                    label1.setFont(new Font(Font.SERIF, Font.BOLD, 34));
                }
            }

        };
        sumButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
    }

}

public class ActionListener {

    public static void main(String[] args) {
        First first = new First();
        first.setVisible(true);
        first.setSize(300, 200);
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
