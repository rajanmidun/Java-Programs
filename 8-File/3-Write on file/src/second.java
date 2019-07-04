import java.util.*;
import java.io.*;
import java.lang.*;
public class second {
	private   Formatter x;
	public  void getclass()
	{
		try{
			x=new Formatter("kaka.txt");
			System.out.println("File is created");
		}
		catch(Exception e)
		{
			System.out.print("Error");
		}
	}
	public  void writeonfile()
	{
		x.format("%s%s%s", "1"," rajan ","magar");
		
	}
	
	public void closefile()
	{
		x.close();
	}
	
}
