package textarea;

import java.awt.FlowLayout;
import java.awt.Label;
import java.util.*;
import javax.swing.*;

class Text extends JFrame {

    private JTextArea jTextField;
    private JScrollPane jScrollPane;
    private JLabel label1,label2;
    public Text() {
        setLayout(new FlowLayout());
        jTextField = new JTextArea(3, 67);
        add(jTextField);  
        jScrollPane = new JScrollPane(jTextField);
        add(jScrollPane);
        
        label1= new JLabel("Image");
        add(label1);
       ImageIcon icon= new ImageIcon(getClass().getResource("E:\\Pictures\\images.jpg"));
       label2= new JLabel(icon);
       add(label2);
    }

}

public class TextArea {

    public static void main(String[] args) {
        Text text = new Text();
        text.setVisible(true);
        text.setSize(200, 300);
        text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
