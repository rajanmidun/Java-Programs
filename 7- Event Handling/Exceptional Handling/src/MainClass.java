class ExceptionDemo extends Exception{
	public ExceptionDemo() {
		
	}
	public ExceptionDemo(String message) {
		super(message);
	}
}
public class MainClass {
	public static void main(String ardgs[])
	{
		try {
		if(3==3)
			throw new ExceptionDemo("This is rajan");
		}
		catch(ExceptionDemo demo) {
			System.out.println(demo.getMessage());
		}
	}

}
