import java.util.Scanner;
public class man {
public static void main(String args[])
{
    try {
    	
    	Scanner rajan= new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=rajan.nextInt();
        int b= rajan.nextInt();
        
        int c=a/b;
        System.out.println("The quotient is "+c);
    }
   catch(Exception e)
    {
	   System.out.println("Error man");
    }
    
    
}
}
