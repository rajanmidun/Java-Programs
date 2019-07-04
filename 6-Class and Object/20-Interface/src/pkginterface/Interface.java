
package pkginterface;
interface user
{
    void getFirstname(String fname);
    void getLastname(String lname);
}
class student implements user{
  public void getFirstname(String f){
      System.out.print("Name is "+f);
  }
 public void getLastname(String l){
      System.out.println(" "+l);
  }
}

public class Interface {
  
    public static void main(String[] args) {
      user ram = new student();
      ram.getFirstname("Ram");
      ram.getLastname("Bamjan");
    }
    
}
