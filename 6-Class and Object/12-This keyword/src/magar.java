class ram
{
   int a;
   int b;
   
   public ram(int a,int b)
   {
	   this.a=a;
	   this.b=b;
   }
   void display()
   {
	   System.out.println("1 no:"+a);
	   System.out.println("2 no:"+b);
   }
}
public class magar {
public static void main(String args[])
{
	ram ra= new ram(3,4);
	ra.display();
}
}
