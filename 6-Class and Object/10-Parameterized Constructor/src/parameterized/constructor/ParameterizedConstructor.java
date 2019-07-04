
package parameterized.constructor;

class Employee
{
      private int age;
      private int salary;
      
      Employee(int age,int salary)
      {
          this.age=age;
          this.salary=salary;
          System.out.println("Age is "+age+" and salary is "+salary);
         }
      
}
public class ParameterizedConstructor {

   
    public static void main(String[] args) {
        Employee emp= new Employee(45,2300);
    }
    
}
