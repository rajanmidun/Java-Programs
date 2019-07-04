
package pkgdefault.constructor;

class Employee
{
      private int age;
      private int salary;
      
      Employee()
      {
          age=45;
          salary=4500;
          System.out.println("Age is "+age+" and salary is "+salary);
         }
      
}
public class DefaultConstructor {

   
    public static void main(String[] args) {
       
        Employee emp= new Employee();
        
        
    }
    
}
