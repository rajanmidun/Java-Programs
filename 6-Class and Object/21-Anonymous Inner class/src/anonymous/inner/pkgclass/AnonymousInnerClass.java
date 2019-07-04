
package anonymous.inner.pkgclass;

 class AnonymousDemo{
  public void show()
  {
   System.out.println("I am in the base class");
  }
}
public class AnonymousInnerClass {

    public static void main(String[] args) {
        AnonymousDemo demo= new AnonymousDemo(){
            public void show()
            {
               System.out.println("I am from the main");
            }
        };
        demo.show();
    }
    
}
