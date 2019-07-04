public class first extends third{
private String name;
private int x;
  public void sonname(String z,int y)
  {
	  name=z;
	  x=y;
  }
  public void displays()
  {
	 System.out.println("Son's name:"+name);
	 System.out.println("Son's age:"+x);
  }
  public static void main(String args[])
  {
	  first rajan= new first();
	  rajan.fathername("Rajan Midun Magar",45);
	  rajan.mothername("Sapana Midun Magar",35);
	  rajan.displayf();
	  rajan.sonname("Samyog", 1);
	  rajan.displays();
	  System.out.println("");
	  
	  second mia= new second();
	  mia.fathername("Rajan Midun Magar",45);
	  mia.mothername("Sapana Midun Magar",35);
	  mia.daughtername("Sumi", 3);
	  mia.displayf();
	  mia.displayd();
  }
}
