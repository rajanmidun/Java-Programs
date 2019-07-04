import java.util.*;
public class main {
public static void main(String args[])
  {
	int a,b;
	Scanner rajan=new Scanner(System.in);
	System.out.println("Enter any two numbers?");
	a=rajan.nextInt();
	b=rajan.nextInt();
	int c;
	c=a>b ? a+b:a*b;
	//here if the first statement is false then the final answer will be the last section part
	System.out.println("The final answer is "+c);
  }
}
