import java.util.Scanner;
public class shyam {
public static void main(String args[])
{
	Scanner rajan=new Scanner(System.in);
	System.out.println("Enter a number!!!");
	int a= rajan.nextInt();
	if(a==0)
		System.out.println("Zero");
	else if(a<0)
	    System.out.println("Negative");
	else
		System.out.println("Positive");
}
}
