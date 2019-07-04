import java.util.*;

public class kaka {
public static void main(String args[])
{
   Scanner rajan= new Scanner(System.in);
   System.out.println("Enter how many data");
   int n=rajan.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
	   a[i]=rajan.nextInt();
   }
   System.out.println("Index\tData");
   int d=0;
   for(int i:a)
   {
	   System.out.println(d+"\t"+i);  
	   d++;
   }
   
}

}
