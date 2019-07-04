import java.util.*;
import java.io.*;
import java.lang.*;


public class magar {
private Scanner x;

public void getclass()
{
 try{
	 x=new Scanner(new File("magar.txt"));
	 System.out.println("The output data is\n");
 }	
 catch(Exception e)
 {
	 System.out.println("Error has occured");
 }
}
public void showdata()
{
    while(x.hasNext())
    {
    	int a=x.nextInt();
    	String b=x.next();
    	String c=x.next();
    	System.out.printf("%d\t%s\t%s\n",a,b,c);
    }
}
public void closefile()
{
x.close();	
}
public static void main(String args[])
{
	magar ma= new magar();
	ma.getclass();
	ma.showdata();
	ma.closefile();
}
}
