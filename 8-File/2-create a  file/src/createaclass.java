import java.util.Formatter;

public class createaclass {
public static void main(String args[])
{
     final Formatter x;
     
     try
     {
    	 x= new Formatter("magar.txt");
    	 System.out.println("File is created");
     }
     
     catch(Exception c)
     {
    	System.out.println("Error has occured"); 
     }
}
}
