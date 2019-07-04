package singleton.pkgclass;
class Rajan{
static Rajan raj= new Rajan();

private Rajan(){

}

public static Rajan getdata(){
  return raj;
}
}
public class SingletonClass {
   
    public static void main(String[] args) {
        Rajan rajan=Rajan.getdata();
    }
    
}
