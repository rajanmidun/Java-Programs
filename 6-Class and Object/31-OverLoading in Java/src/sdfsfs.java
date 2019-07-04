class rajan
{
    public void name()
    {
    	System.out.println("My name is Rajan");
    }
    
    public void name(String address)
    {
    	System.out.println("My address is "+address);
    }
    
    public void name(int salary,int age)
    {
    	System.out.println("My age is "+age);
    	System.out.println("My salary is "+salary);
    }
    

}
public class sdfsfs {
public static void main(String args[])
{
    rajan obj= new rajan();
    obj.name();
    obj.name("Dhungeadda");
    obj.name(20000, 20);
}
}
