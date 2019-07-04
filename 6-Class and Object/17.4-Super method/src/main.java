class A{
	public A()
	{
	System.out.println("He is awesome");
	}
	public A(int a)
	{
		super();
	System.out.println("He is awesome parameter");
	}
}

class B extends A{
	public B()
	{
	System.out.println("He is good");
	}
	public B(int a)
	{
		super();//if we donot use super() then also it will call the super class default constructor
	System.out.println("He is good parameter");
	}
}
public class main {
	public static void main(String ags[])
	{
		 B ob= new B(6);
	}
}
