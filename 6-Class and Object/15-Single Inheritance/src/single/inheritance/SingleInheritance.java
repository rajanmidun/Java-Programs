
package single.inheritance;
class SimpleCalculator
{
   protected int a,b;
    protected void getdata(int x,int y){
        a=x;
        b=y;
    }
    public int displaySum(){
     return a+b;
}
}

class Advance extends SimpleCalculator
{
  public int displaySub()
  {
     return a-b;
  }
    
}
public class SingleInheritance {

    public static void main(String[] args) {
      Advance ad= new Advance();
      ad.getdata(3, 5);
      int c=ad.displaySum();
      System.out.println("Sum is "+c);
      int d=ad.displaySub();
       System.out.println("Sum is "+d);
    }
    
}
