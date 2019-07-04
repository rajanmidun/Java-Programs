import java.util.Scanner;
public class calculator {
public static void main(String args[]){
	float a,b,c;
	Scanner rajan = new Scanner(System.in);
	System.out.print("Enter the first number");
	a= rajan.nextFloat();
	System.out.print("Enter the second number");
	b= rajan.nextFloat();
	System.out.print("The sum is ");
	System.out.println(a+b);
	System.out.print("The Difference is ");
	System.out.println(a-b);
	System.out.print("The Product is ");
	System.out.println(a*b);
	System.out.print("The quotient is ");
	System.out.println(a/b);
}
}
