
package tostring;

class Display{
     private int age,day,month,year;
     private String name;
     
     public Display(int age,String name,int day,int month,int year)
     {
       this.age=age;
       this.name=name;
       this.day=day;
       this.month=month;
       this.year=year;
     }
     public void showData(){
        System.out.printf("Name is %s and age is %d and Birthday is in %s",name,age,this);
     }
     public String toString()
     {
          return String.format("%d:%d:%d\n", day,month,year);
     }
     
}
public class ToString {
    public static void main(String[] args) {
        Display dis= new Display(23,"Rajan Magar",11,01,1997);
        dis.showData();
        
    }
    
}
