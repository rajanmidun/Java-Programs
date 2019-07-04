
package multilevel.inheritance;

class A{
    protected int x,y;
    public A()
    {
       System.out.print("");
    }
    public A(int a,int b)
    {
        x=a;
        y=b;
        System.out.println("The sum is "+(x+y));
    }
}
class B extends A
 {
    public B()
    {
        System.out.println("The Subtract is "+(x-y));
    }
  }
class C extends B
{
   public C()
   {
       System.out.println("The product is "+(x*y));
   }
}
    
public class MultilevelInheritance {

 
    public static void main(String[] args) {
        A obj= new A(2,3);
        C obj1= new C();
        
        
        
    }
    
}
