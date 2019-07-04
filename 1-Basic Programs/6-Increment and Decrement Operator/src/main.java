import java.util.*;
public class main {
public static void main(String args[])
   {
	  Scanner rajan= new Scanner(System.in);
	  System.out.println("Enter any number");
      int a=rajan.nextInt();
      int b=a;
      int c=a;
      b++;
      ++c;
      System.out.println("Post increment value of "+a+" is: "+b);
      System.out.println("Pre increment value of "+a+" is: "+c);
      /*1:In post-increment first value of variable is used in the expression
        (initialize into another variable) and then increment the value of variable
        In pre-increment first increment the value of variable and then used inside the expression 
        (initialize into another variable). and similar for decrement operation
       */
      int d=a;
      int e=a;
      d--;
      --e;
      System.out.println("Post decrement value of "+a+" is: "+d);
      System.out.println("Pre decrement value of "+a+" is: "+e);
  }
}
