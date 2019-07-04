import java.util.*;
public class main {
	public static void main(String args[])
	   {
		int age;
		String name;
		Scanner rajan=new Scanner(System.in);
		System.out.println("Enter your name ?");
		name=rajan.nextLine();
		System.out.println("Enter your age ?");
		age =rajan.nextInt();
		System.out.println("\nYour Information");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	  }
}
