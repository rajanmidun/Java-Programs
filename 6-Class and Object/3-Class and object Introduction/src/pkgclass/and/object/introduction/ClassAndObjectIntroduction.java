
package pkgclass.and.object.introduction;

class Employee{
    int salary;
    String name;
   
   void displayData()
   {
      System.out.println("Name is "+name+" Salary is "+salary);
   }
}

public class ClassAndObjectIntroduction {

   
    public static void main(String[] args) {
        Employee ram=new Employee();
        ram.salary=4000;
        ram.name="Ram Bahadur Karki";
        ram.displayData();
        
        Employee hari=new Employee();
        hari.salary=5000;
        hari.name="Hari Bahadur Karki";
        hari.displayData();
        
    }
    
}
