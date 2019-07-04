import java.util.*;
public class main {
public static void main(String args[])
{
   Scanner rajan= new Scanner(System.in);
   int n;
   System.out.println("Enter the no of data");
   n=rajan.nextInt();
   int a[]= new int[n];
   float total=0;
   for(int i=0;i<n;i++)
   {
	   a[i]=rajan.nextInt();
   }
   System.out.println("The average of :");
   for(int i:a)
   {
	   System.out.print(i+" ");
	   total+=(float)i;
   }
   System.out.println(" is "+total/(float)n);
}
}
