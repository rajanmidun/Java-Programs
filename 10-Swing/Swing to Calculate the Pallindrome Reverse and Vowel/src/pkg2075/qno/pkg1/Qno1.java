package pkg2075.qno.pkg1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Operations extends JFrame {

    JLabel messageLabel, outputLabel;
    JButton pallindromeButton, reverseButton, vowelButton;
    JTextField inputField, outputField;

    public Operations() {
        setLayout(new GridLayout(3, 2));
        messageLabel = new JLabel("Input any String");
        add(messageLabel);
        inputField = new JTextField();
        add(inputField);

        outputLabel = new JLabel("Output");
        add(outputLabel);
        pallindromeButton = new JButton("Pallindrome");
        pallindromeButton.addActionListener(new event());
        add(pallindromeButton);

        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(new event());
        add(reverseButton);
        vowelButton = new JButton("Vowel");
        vowelButton.addActionListener(new event());
        add(vowelButton);
    }

    class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText();
            int length = input.length();
            int len = length;
            int count = 0;
            if (e.getSource() == pallindromeButton) {
                for (int i = 0; i < length / 2; i++) {
                    if (input.charAt(i) == input.charAt(len - 1)) {
                        count++;
                    }
                    len--;
                }
                if (length / 2 == count) {
                    outputLabel.setText("Yes Pallindrome");
                } else {
                    outputLabel.setText("Not a Pallindrome");
                }

            }
            if (e.getSource() == vowelButton) {
                String vowel = "";
                int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
                for (int i = 0; i < length; i++) {
                    char c = input.charAt(i);
                    if ((c == 'a' || c == 'A') && countA == 0) {
                        countA++;
                        vowel = vowel + " " + input.charAt(i);
                    } else if ((c == 'e' || c == 'E') && countE == 0) {
                        countE++;
                        vowel = vowel + " " + input.charAt(i);
                    } else if ((c == 'i' || c == 'I') && countI == 0) {
                        countI++;
                        vowel = vowel + " " + input.charAt(i);
                    } else if ((c == 'o' || c == 'O') && countO == 0) {
                        countO++;
                        vowel = vowel + " " + input.charAt(i);
                    } else if ((c == 'u' || c == 'U') && countU == 0) {
                        countU++;
                        vowel = vowel + " " + input.charAt(i);
                    }

                }
                outputLabel.setText("Vowel's " + vowel);
            }
            if (e.getSource() == reverseButton) {
                String reverse = "";
                for (int i = length - 1; i >= 0; i--) {
                    reverse += input.charAt(i);
                }
                outputLabel.setText("Reverse " + reverse);
            }
        }
    }

}

public class Qno1 {

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.setSize(300, 300);
        operations.setVisible(true);
        operations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
