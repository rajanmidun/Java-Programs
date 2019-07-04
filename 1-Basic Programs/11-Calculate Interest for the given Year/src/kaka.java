import java.util.*;
public class kaka {
public static void main(String args[])
  {
	Scanner rajan= new Scanner(System.in);
	int P,T,R;
	float I;
	System.out.println("Enter the principle, Time and Rate");
	P=rajan.nextInt();
	T=rajan.nextInt();
	R=rajan.nextInt();
	I=(float)(P*T*R)/(float)100;
	System.out.println("You entered");
	System.out.println("Principle : Rs "+P);
	System.out.println("Time :"+T+"Yrs");
	System.out.println("Rate : "+R+"%");
	System.out.println("\nAfter calcualtion");
	System.out.println("The simple interest is Rs: "+I);
  }
}
