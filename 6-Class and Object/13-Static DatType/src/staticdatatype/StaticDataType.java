
package staticdatatype;
class sum{
   private String name ;
    private  String address;
   private static int licenseno=0;
   
   sum(String name,String address)
   {
         this.name=name;
         this.address=address;
   }
   public void display()
   {
       System.out.println("Name is "+name);
       System.out.println("Address is "+address);
      
   }
   public static void licenseno()
   {
   licenseno++;
    System.out.println("LicenseNo is "+licenseno);
   }
   
}

public class StaticDataType {

   
    public static void main(String[] args) {
      
          sum object= new sum("Rajan","DhungeDhara");
          object.display();
         sum. licenseno();
           sum object1= new sum("Ra","DhungeDhara");
          object1.display();  
          sum.licenseno();
    }
    
}
