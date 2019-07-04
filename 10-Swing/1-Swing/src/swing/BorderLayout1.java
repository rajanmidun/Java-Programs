package swing;

import javax.swing.*;
import java.awt.*;
public class BorderLayout1 extends JFrame{
    private JButton button1,button2,button3,button4,button5;
    public BorderLayout1(){
     setLayout(new BorderLayout());
     button1= new JButton("First");
     add(button1 ,BorderLayout.PAGE_START);
     button2= new JButton("Second");
     add(button2, BorderLayout.LINE_START);
     button3= new JButton("Third");
     add(button3 ,BorderLayout.CENTER);
     button4= new JButton("Fourth");
     add(button4 ,BorderLayout.LINE_END);
     button5= new JButton("Fifth");
     add(button5,BorderLayout.PAGE_END);
     
    }
 
}
