package inner.pkgclass;

public class InnerClass {
    
    public void show(){
       System.out.println("From outerclass");
    }
    public class InnerDemo{
       
        void display(){
          System.out.println("From inner class");
        }
        
    }

    
    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        InnerClass.InnerDemo obj= outer.new InnerDemo();
        outer.show();
        obj.display();
    }
    
}
