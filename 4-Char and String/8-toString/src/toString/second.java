package toString;

public class second {
	private int year;
	private int month;
	private int days;
public second(int y,int m,int d)
{
	    year=y;
	    month=m;
	    days=d;
    	System.out.println("The current date is "+this);
}

public String toString()
{
	return String.format("%d-%d-%d",year,month,days);
}
}
