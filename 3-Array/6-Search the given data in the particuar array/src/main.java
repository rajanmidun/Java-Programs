import java.util.*;

public class main {
public static void main(String args[])
{
   Scanner rajan= new Scanner(System.in);
   int n,i,j,d;
   int c=0;
   int a[]= {1,7,4,3,9,6,7};
   System.out.println("Enter how data which you want to check in the array");
   n= rajan.nextInt();
   for(i=0;i<a.length;i++)
   {
	if(a[i]==n)
	{
		d=i+1;
	    System.out.println("Yes "+n +" is present in the array and is in the position "+d);	
	}	
   }
	  
}
}
