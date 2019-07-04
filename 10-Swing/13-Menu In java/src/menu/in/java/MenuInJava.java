
package menu.in.java;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.sum;
import javax.swing.*;
import java.util.*;

class First extends JFrame{
    private JMenuBar menuBar;
    private JMenu homeMenu,fileMenu,contactMenu;
    private JMenuItem newItem;
    
    public First(){
    super("Menu in java");
    setLayout(new FlowLayout());
    
    menuBar= new JMenuBar();
    add(menuBar);
    
    homeMenu= new JMenu("Home");
    menuBar.add(homeMenu);
     fileMenu= new JMenu("File");
    menuBar.add(fileMenu);
     contactMenu= new JMenu("Contact");
    menuBar.add(contactMenu);
    newItem = new JMenuItem("Doc");
    fileMenu.add(newItem);
    
    newItem.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e){
            dispose();
           Document document= new Document();
           document.setVisible(true);
           
        }
    }
    );
    }
}

public class MenuInJava {


    public static void main(String[] args) {
        First first = new First();
        first.setVisible(true);
        first.setSize(200, 200);
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
