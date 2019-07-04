class A{
	public void show()
	{
	System.out.println("He is awesome");
	}
}

class B extends A{
	public void show()
	{
		super.show();
	    System.out.println("He is not good");
	}
}
public class main {
	public static void main(String ags[])
	{
		 B ob= new B();
		 ob.show();
	}
}
