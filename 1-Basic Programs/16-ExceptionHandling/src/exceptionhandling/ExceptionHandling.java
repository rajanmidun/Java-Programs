
package exceptionhandling;


public class ExceptionHandling {

    
    public static void main(String[] args) {
         int a[]={1,2,3,4};
         try{
         System.out.println("Element at position 10 is"+a[10]);
         }
         catch(Exception e)
         {
            System.out.println("Array difficult to manage");
         }
         finally{
         System.out.println("After try and catch");
         }
         
         //use of throw in exceptional handling
         int age=10;
         if(age<11)
             throw new ArithmeticException("You are under age");
         else
             System.out.println("You are old enough to marry");
         
    }
    
}
