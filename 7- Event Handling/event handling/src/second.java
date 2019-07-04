import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class second extends JFrame{
  private JTextField item1;
  private JTextField item2;
  private JPasswordField  pass;
  
  public second(){
	  super("This is the titile");
	  setLayout(new FlowLayout());
	  item1= new JTextField(10);
	  add(item1);
	  item2 =new JTextField("Enter the text in here",30);
	  item2.setEditable(false);
	  add(item2);
	  pass= new JPasswordField("mypass");
	  add(pass);
	  
	  thehandler handler = new thehandler();
	  item1.addActionListener(handler);
	  item2.addActionListener(handler);
      pass.addActionListener(handler);
       
  }
  private class thehandler implements ActionListener{
	  public void actionPerformed(ActionEvent event){
		 String string="";
		 if(event.getSource()==item1)
			 string =String.format("Field 1: %s", event.getActionCommand());
	 	 else if(event.getSource()==item2)
			 string =String.format("Field 2: %s", event.getActionCommand());
		 else if(event.getSource()==pass)
			 string =String.format("Field 3: %s", event.getActionCommand());
		 
		JOptionPane.showMessageDialog(null,string); 
	  }
  }
}
