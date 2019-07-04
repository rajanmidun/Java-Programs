package popupmenuinjava;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class PopupDemo extends JFrame {

    public PopupDemo() {
        setLayout(new FlowLayout());

        JLabel label1= new JLabel();
        add(label1);
        JPopupMenu popup = new JPopupMenu();

        JMenuItem file = new JMenuItem("File");
        popup.add(file);
        JMenuItem copy = new JMenuItem("Copy");
        popup.add(copy);
        JMenuItem cut = new JMenuItem("Cut");
        popup.add(cut);

        
        file.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            label1.setText("File is selected");
        }
        }
        );
        copy.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            label1.setText("Copy is selected");
        }
        }
        );
        cut.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            label1.setText("Cut is selected");
        }
        }
        );
        
          addMouseListener(new MouseAdapter() {  
            public void mouseReleased(MouseEvent e) {              
                popup.show(e.getComponent() , e.getX(), e.getY());  
            }                 
         });  
       
    }
}

public class PopupMenuinJava {

    public static void main(String[] args) {
        PopupDemo demo = new PopupDemo();
        demo.setVisible(true);
        demo.setSize(200, 200);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
