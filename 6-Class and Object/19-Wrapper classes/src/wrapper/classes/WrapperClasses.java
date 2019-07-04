
package wrapper.classes;


public class WrapperClasses {

   
    public static void main(String[] args) {
        int i=10;
        Integer value= new Integer(i); //wrapping or boxing
        System.out.println(value);
        int j=value.intValue();  //unwrapping or unboxing
        System.out.println(j);
        
        Integer val= i; //autoboxing or autowrapping
        
        int k=val; //autounboxing
    }
    
}
