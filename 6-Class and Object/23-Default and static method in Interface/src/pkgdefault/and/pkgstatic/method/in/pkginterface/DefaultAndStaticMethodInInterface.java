
package pkgdefault.and.pkgstatic.method.in.pkginterface;
interface calculate
{
   int a=6;
  void show();
  default void calculate(){
    System.out.println("Hello rajan from default function");
  }
  public static void display()
  {
      System.out.println("Hello rajan from static function");
  }
}
class Rectangle implements calculate
{
  public void show()
  {
    System.out.println("Hello rajan from the show function");
  }
}

public class DefaultAndStaticMethodInInterface {

    public static void main(String[] args) {
     Rectangle rectangle= new Rectangle();
     rectangle.calculate();
     rectangle.show();
     calculate.display();
      
    }
    
}
