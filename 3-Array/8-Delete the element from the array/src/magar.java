import java.util.*;
public class magar {
public static void main(String args[])
{
   int a[]={1,2,3,4,5,6};
   Scanner name= new Scanner(System.in);
   
   System.out.println("Enter the index of the element which you want to delete");
   int index=name.nextInt();
   for(int i=0;i<a.length-1;i++)
   {
	   if(i==index)
		   a[i]=a[i+1];
	   else if(i>index)
	   {
		   int temp=a[i];
		   a[i]=a[i+1];
		   a[i+1]=temp;
	   }
   }
   System.out.println("Array after deleting the "+index+" index data is:");
   for(int i=0;i<a.length-1;i++)
   {
	   System.out.println(a[i]);
   }
}
}
