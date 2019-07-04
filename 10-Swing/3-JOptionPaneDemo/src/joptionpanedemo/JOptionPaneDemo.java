
package joptionpanedemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 class jframeDemo extends JFrame{  
    private JFrame frame1;
    
    public jframeDemo()
    {
       super("Check JFrame");
       setLayout(new FlowLayout());
    }
    
}
public class JOptionPaneDemo {

  
    public static void main(String[] args) {
        String firstNumber=JOptionPane.showInputDialog("Enter the first number?");
        String secondNumber=JOptionPane.showInputDialog("Enter the second number?");
        int first=Integer.parseInt(firstNumber);
        int second=Integer.parseInt(secondNumber);
        int sum=first+second;
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"The title bar",JOptionPane.PLAIN_MESSAGE);
    }
    
}
