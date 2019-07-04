package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Check extends JFrame {

    private JLabel label1;
    private JCheckBox italic,bold;

    public Check() {
        setLayout(new FlowLayout());
        label1 = new JLabel("Rajan Midun");
        label1.setFont(new Font(Font.SERIF, Font.PLAIN, 34));
        add(label1, JLabel.CENTER);

        bold= new JCheckBox("Bold");
        add(bold);
        italic= new JCheckBox("Italic");
        add(italic);
        
        ActionListener listener= new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e)
           {
             if(bold.isSelected() &&italic.isSelected())
                 label1.setFont(new Font(Font.SERIF,Font.BOLD+Font.ITALIC,34));
             else if(italic.isSelected())
                  label1.setFont(new Font(Font.SERIF,Font.ITALIC,34));
             else if(bold.isSelected())
                  label1.setFont(new Font(Font.SERIF,Font.BOLD,34));
           }
        
        };
        bold.addActionListener(listener);
        italic.addActionListener(listener);
        
    }
  
     
}

public class CheckBox {

    public static void main(String[] args) {
        Check check = new Check();
        check.setVisible(true);
        check.setSize(200, 300);
        check.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
