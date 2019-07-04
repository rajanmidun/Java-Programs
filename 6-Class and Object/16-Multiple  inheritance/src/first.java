//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
public class first extends third, second{
private String name;
  public void getc(String z)
  {
	  name=z;
  }
  public void displaysum()
  {
	 System.out.println("My name:"+name);
  }
  public static void main(String args[])
  {
	  first rajan= new first();
	  rajan.fathername("Rajan Midun Magar",45);
	  rajan.displayf();
	  rajan.mothername("Rajan Midun Magar",45);
	  rajan.displaym();
  }
}
