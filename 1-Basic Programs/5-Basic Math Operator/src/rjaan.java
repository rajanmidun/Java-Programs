import java.util.Scanner;
public class rjaan {
public static void main(String args[])
{
	Scanner rajan= new Scanner(System.in);
	float a,b;
	System.out.println("Enter any two numbers?");
	a=rajan.nextFloat();
	b=rajan.nextFloat();
	System.out.println("The Addition is "+(a+b));
	System.out.println("The Subtraction is "+(a-b));
	System.out.println("The Multiplication is "+(a*b));
	System.out.println("The Division is "+(a/b));
	System.out.println("The Reminder is "+(a%b));
}
}
