
public class main {
public static void main(String args[])
{
   int a[]={100,322,14,548,23,64,234};
   for(int i=0;i<a.length;i++)
   {
	   for(int j=i+1;j<a.length;j++)
	   {
		   if(a[i]>a[j])
		   {
			   int temp=0;
			   temp=a[i];
			   a[j]=a[i];
			   a[i]=a[j];
		   }
	   }
   }
   System.out.println("The largest no is: "+a[a.length-1]);
  
}
}
