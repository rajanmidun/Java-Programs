import java.util.*;
import java.util.Arrays;
public class rajan {
public static void main(String args[])
{
	 int a[]={1,2,3,4,5,6};
	 int i,j,n,pos;
	 Scanner rajan= new Scanner(System.in);
	 System.out.print("Enter the value and index of the value where you want to add it");
	 n=rajan.nextInt();
	 pos=rajan.nextInt();
	 int b[]=new int[a.length+1];
	 if(pos>a.length)
	 {
		 System.out.print("Cannot insert the data");
		 
	 }
		 else
	 {
		
	    for(i=b.length-1;i>=0;i--)
	     {
		  if(i==pos)
			  b[i]=n;
		     
		  else if(i>pos)
		  {
			b[i]=a[i-1];
		  }
		  else
		  {
			  b[i]=a[i];
		  }
		 
	     }
	    for(int p:b)
			 System.out.println(p);
	 }
	
}
}
