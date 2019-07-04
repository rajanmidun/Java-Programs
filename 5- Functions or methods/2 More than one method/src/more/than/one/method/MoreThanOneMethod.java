
package more.than.one.method;


public class MoreThanOneMethod {
 
    private int age;
    private String name;
    private String address;
    public  void getData(int age,String name,String address)
    {
         this.age=age;
         this.name=name;
         this.address=address;
    }
    public  void display()
    {
      System.out.println("Name is "+name);
      System.out.println("Address is "+address);
      System.out.println("Age is "+age);
    }

    public static void main(String[] args) {
        
        MoreThanOneMethod obj= new MoreThanOneMethod();
       obj. getData(32,"Ram","Kathamandu");
       obj. display();
    }
    
}
