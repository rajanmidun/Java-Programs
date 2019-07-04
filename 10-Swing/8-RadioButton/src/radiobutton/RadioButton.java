
package radiobutton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Radio extends JFrame {

    private JLabel label1;
    private JRadioButton italic,bold,both;
    private ButtonGroup button;

    public Radio() {
        setLayout(new FlowLayout());
        label1 = new JLabel("Rajan Midun");
        label1.setFont(new Font(Font.SERIF, Font.PLAIN, 34));
        add(label1, JLabel.CENTER);

        bold= new JRadioButton("Bold");
        add(bold);
        italic= new JRadioButton("Italic");
        add(italic);
         both= new JRadioButton("Bold and Italic");
        add(both);
        
        button = new ButtonGroup();
        button.add(bold);
        button.add(italic);
        button.add(both);
        
        ActionListener listener= new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e)
           {
             if(both.isSelected())
                 label1.setFont(new Font(Font.SERIF,Font.BOLD+Font.ITALIC,34));
             else if(italic.isSelected())
                  label1.setFont(new Font(Font.SERIF,Font.ITALIC,34));
             else if(bold.isSelected())
                  label1.setFont(new Font(Font.SERIF,Font.BOLD,34));
           }
        
        };
        bold.addActionListener(listener);
        italic.addActionListener(listener);
        both.addActionListener(listener);
    }
     
}

public class RadioButton {

    
    public static void main(String[] args) {
        Radio check = new Radio();
        check.setVisible(true);
        check.setSize(200, 300);
        check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
