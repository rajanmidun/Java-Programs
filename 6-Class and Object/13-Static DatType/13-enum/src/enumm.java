import java.util.EnumSet;
enum rajan
{
	color1("Red",3),
	color2("Black",4);
	private String name;
	private int num;
	
	rajan(String na,int a)
	{
		name=na;
		num=a;
	}
	public String getname()
	{
		return name;
	}
	public int getcode()
	{
		return num;
	}
}
public class enumm {
public static void main(String args[])
{
	for(rajan na:rajan.values())
		System.out.printf("%s\t%s\t%d\n", na,na.getname(),na.getcode());
	
	System.out.println("Range set");
    for(rajan na: EnumSet.range(rajan.color1, rajan.color1))
    	System.out.printf("%s\t%s\t%d\n", na,na.getname(),na.getcode());
	
}
}
