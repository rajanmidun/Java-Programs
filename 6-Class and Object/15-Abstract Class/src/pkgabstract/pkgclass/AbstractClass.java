package pkgabstract.pkgclass;
abstract class Shapes{
    protected double length,breadth,radius;
    public abstract void area();   
    public void getRectangleData(double l, double b){
        length= l;
        breadth=b;
   }
     public void getCircleData(double r){
        radius=r;
   }
    
}
class Rectangle extends Shapes{
    
 public void area()
 {
   System.out.println("Area of Rectangle is "+(length*breadth));
 }
}
class Circle extends Shapes{
    
 public void area()
 {
   System.out.println("Area of Rectangle is "+(Math.PI*radius*radius));
 }
}
public class AbstractClass {
   
    public static void main(String[] args) {
        Shapes rec= new Rectangle();
        rec.getRectangleData(2, 3);
        rec.area();
       Shapes cir= new Circle();
       cir.getCircleData(3);
       cir.area();
    }
    
}
