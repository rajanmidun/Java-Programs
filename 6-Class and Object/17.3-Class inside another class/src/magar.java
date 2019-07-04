class A{
	int a;
	void rajan()
	{
		System.out.println("He is awesome");
	}
	
	class B
	{
		void get()
		{
			System.out.println("He is so food");
		}
	}
}
public class magar {

	public static void main(String[] args) {
      
		A ob =new A();
		ob.rajan();
		
		A.B ob1 =ob.new B();
		ob1.get();
	}

}
