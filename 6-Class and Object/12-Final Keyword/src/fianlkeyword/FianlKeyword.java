
package fianlkeyword;

class finaldata{
 private final int a=13;
 private int b;
 
 finaldata(int c)
 {
     //check for the following initaialization
     // a=9;
     b=c;
 }
 void display(){
    System.out.println("Sum is "+(a+b));
 }
}

public class FianlKeyword {

    public static void main(String[] args) {
         finaldata data= new finaldata(5);
         data.display();
        
    }
    
}
