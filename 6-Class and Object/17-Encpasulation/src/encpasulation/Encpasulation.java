
package encpasulation;
class Encap{
  private int age;
  private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
  
}

public class Encpasulation {   
    public static void main(String[] args) {
       Encap obj= new Encap();
       obj.setName("Rajan");
       obj.setAge(20);
       System.out.println(obj.getName());
       System.out.println(obj.getAge());
    }
    
}
