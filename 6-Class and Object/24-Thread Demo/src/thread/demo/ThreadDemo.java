
package thread.demo;

import java.util.Date;

class Thread1 implements Runnable{
  public void run()
  {
   for(int i=0;i<10;i++)   
   {
       try{
        Date date= new Date();
        System.out.println(date.toString());
        Thread.sleep(1000);
       }
      catch(InterruptedException e) 
      { }
   }
  }
}
class Thread2 implements Runnable{
  public void run()
  {
   for(int i=0;i<10;i++)   
   {
       try{
        System.out.println("Hey Rajan");
        Thread.sleep(1000);
       }
      catch(Exception e) 
      { }
   }
  }
}
public class ThreadDemo {
    public static void main(String[] args) {
    Thread th1= new Thread(new Thread1());
    Thread th2= new Thread(new Thread2());
     th1.start();
     try{Thread.sleep(500);
     } 
     catch(Exception e){}
     th2.start();
    }
    
}
