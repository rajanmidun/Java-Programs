
package pkgthrow.and.pkgthrows;


public class ThrowAndThrows {

    public static void throwsDemo() throws Exception{
        int a=0;
        int b=5;
        System.out.println(b/a);
    }
    public static void throwDemo(){
     int a=0;
     int b=5;
     try{
     if (a==0)
         throw new ArithmeticException("0 cannot divide any number");
    }
    catch(ArithmeticException e){
            System.out.println(e.getMessage());
}
    }
    

    public static void main(String[] args) throws Exception {
        throwDemo();
        throwsDemo();
        
    }
    
}
