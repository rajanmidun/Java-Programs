
public class dob {
	private int year;
	private int month;
	private int days;
	
	public dob(int y,int m,int d)
	{
		year=y;
		month=m;
		days=d;
	}
	void display()
	{
		System.out.println(this);
	}
    
    public String toString()
    {
    	return String.format("%d-%d-%d",year,month,days);
    }
}
