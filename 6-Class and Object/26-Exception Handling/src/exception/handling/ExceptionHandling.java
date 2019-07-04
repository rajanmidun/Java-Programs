
package exception.handling;


public class ExceptionHandling {

 
    public static void main(String[] args) {
        
        try{
             int c=9/2;
             int a[]= new int[4];
             a[6]=7;
             System.out.println("Not any Exception!!");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println("index out of bound!!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic errors occur!!");
        }
        finally{
         System.out.println("Hey end of Exceptional Handling!!");   
        }
    }
    
}
