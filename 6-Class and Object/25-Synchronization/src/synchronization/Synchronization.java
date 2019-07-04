
package synchronization;
 class Syn{
  private int count=0;
  public synchronized void increment(){
     count++;
  }
  public synchronized int display(){
   return count;   
  }
}

public class Synchronization {  
    public static void main(String[] args) throws Exception{
        Syn obj= new Syn();
       Thread th1=new Thread(new Runnable() {
         public void run(){
          for(int i=0;i<100;i++)
          {
             obj.increment();
          }
         }
       }) ;
     Thread th2=new Thread(new Runnable() {
         public void run(){
          for(int i=0;i<100;i++)
          {
             obj.increment();
          }
         }
       }) ;
    th1.start();
    th2.start();
    th1.join();
    th2.join();
    System.out.println(obj.display());
    }
    
}
