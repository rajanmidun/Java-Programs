
package copy.constructor;

class Employee
{
      private int age;
      private int salary;
      
      Employee()
      {
          age=45;
          salary=4500;
          System.out.println("In Default Constructor");
          System.out.println("Age is "+age+" and salary is "+salary);
         }
      
        Employee(int age,int salary)
      {
          this.age=age;
          this.salary=salary;
          System.out.println("\nIn Parameterized Constructor");
          System.out.println("Age is "+age+" and salary is "+salary);
         }
        
          Employee(Employee emp1)
      {
          age=emp1.age;
          salary=emp1.salary;
          System.out.println("\nIn Copy Constructor");
          System.out.println("Age is "+age+" and salary is "+salary);
         }
      
}
public class CopyConstructor {

   
    public static void main(String[] args) {
        Employee emp1= new Employee();
        Employee emp2= new Employee(45,2300);
        Employee emp3= new Employee(emp2);
        
    }
    
}
