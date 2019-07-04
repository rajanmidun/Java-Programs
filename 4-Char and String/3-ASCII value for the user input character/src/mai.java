import java.util.*;
public class mai {
public static void main(String args[])
{
    Scanner rajan= new Scanner(System.in);
    int n;
    char d;
    System.out.println("Enter how many character?");
    n=rajan.nextInt();
    char c[]=new char[n];
    System.out.println("Enter the character?");
    for(int i=0;i<n;i++)
    {
    	d=rajan.next().charAt(0);
    	c[i]=d;
    }
    System.out.println("Your Inputed Data with ASCII Value is:\nChar\tASCII");
    for(char i:c)
    {
    	System.out.println(i+"\t"+(int)i);
    }
}
}
