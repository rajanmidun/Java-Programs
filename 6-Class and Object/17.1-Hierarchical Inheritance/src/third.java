
public class third {
protected String name; 
protected String name1;
protected int age;
protected int age1;
public void fathername(String x,int y)
{
	name=x;
	age=y;
}
public void mothername(String x,int y)
{
	name1=x;
	age1=y;
}
public void displayf()
{
	System.out.println("Father name:"+name);
	System.out.println("Father age:"+age);
	System.out.println("Mother name:"+name1);
	System.out.println("Mother age:"+age1);
}
}
