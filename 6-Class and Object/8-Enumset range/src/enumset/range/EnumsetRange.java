package enumset.range;

import java.util.EnumSet;

public class EnumsetRange {
    enum Employee{
         RAJAN(1,"Rajan midun"),
           HARI(2,"Hari midun"),
             KAKA(3,"Kaka midun"),
               DAKA(4,"Daka midun"),
                 MAINA(5,"Maina midun"),
                   CHARI(6,"Chari midun"),
                     MAHILA(7,"Mahila midun");
         int ID;
         String name;
         
         Employee(int a,String nam)
         {
               ID=a;
               name=nam;
         }
        public void display(){
             System.out.println("Name is :"+name);
              System.out.println("ID is: "+ID);
         }
      
    }
    public static void main(String[] args) {
          System.out.println("Display all data");
          for(Employee emp:Employee.values()){
           System.out.println("Enumeration is "+emp);
            emp.display();
        }       
            System.out.println("Display Range data");
           for(Employee emp:EnumSet.range(Employee.RAJAN,Employee.KAKA)){
           System.out.println("Enumeration is "+emp);
            emp.display();
        }       
    }
    
}
