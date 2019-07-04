import java.util.Scanner;
public class kaka {
public static void main(String ar[])
{
	Scanner rajan= new Scanner(System.in);
		int c;
	System.out.println("\t\t\tMenu ");
	System.out.println("1:Sum\t2:Subtract\t3:Multiply\t 4:Divide");
	System.out.println("Enter any two numbers");
	int a =rajan.nextInt();
	int b= rajan.nextInt();
    System.out.println("Enter your choice");
    c=rajan.nextInt();
    switch(c)
    {
    case 1:
    	System.out.println("The Addition is "+(a+b));
    	break;
    case 2:
    	System.out.println("The Subtraction is "+(a+b));
    	break;
    case 3:
    	System.out.println("The Multiplication is "+(a+b));
    	break;
    case 4:
    	System.out.println("The Division is "+(a+b));
    	break;
    default:
    	System.out.println("Please enter (1-4) only");
    	break;
    }
}
}
