
public class person {
	private String name;
    private String address;
    private dob magar;
    
    public person(String name,String address,dob ob)
    {
    	this.name=name;
    	this.address=address;
    	magar=ob;
    }
    void display()
    {
    	System.out.println("My name is "+name);
    	System.out.println("My address is: "+address);
    	System.out.println("My birthday is in "+magar);
    }	
}
