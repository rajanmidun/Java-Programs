
package dropdown;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Drop extends JFrame{
 private JLabel label1;
 private JComboBox box;

 public Drop()
 {
  setLayout(new FlowLayout());   
     final int FONT_SIZE=35;
     label1= new JLabel("Hello Rajan",Font.PLAIN);
     add(label1);
     String[] fontNames={Font.SERIF,Font.DIALOG,Font.DIALOG_INPUT,Font.MONOSPACED};
     JComboBox box= new JComboBox(fontNames);
     add(box);
     
     
     pack();
     ActionListener listener= new ActionListener(){
          @Override
         public void actionPerformed(ActionEvent e)
         {
             String fontName=(String) box.getItemAt(box.getSelectedIndex());
             label1.setFont(new Font(fontName,Font.PLAIN,FONT_SIZE));
         }
     };
     box.addActionListener(listener);
     
 }
    
}

public class Dropdown {


    public static void main(String[] args) {
        Drop drop= new Drop();
        drop.setVisible(true);
        drop.setSize(300,300);
        drop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
