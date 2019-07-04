
public class main {
	private int a;
	private int b;
	private String name;
	
	public main()
	{
		System.out.println("I am in default constructor");
	}
	
	public main(int aa,int bb,String na)
	{
		a=aa;
		b=bb;
		name=na;
	}
	
	public main(main ob)
	{
		a=ob.a;
		b=ob.b;
		name=ob.name;
	}
	public void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("First no is:"+a);
		System.out.println("Second no is:"+b);
	}
public static void main(String ages[])
{
  	new main();
  	System.out.println("\nParameterized constructor");
  	main shyam= new main(2,3,"Rajan");
  	shyam.display();
  	System.out.println("\nCopy constructor");
  	main shya= new main(shyam);
  	shya.display();
}
}
