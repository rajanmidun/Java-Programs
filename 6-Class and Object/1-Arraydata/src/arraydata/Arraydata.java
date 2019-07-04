
package arraydata;

import java.util.ArrayList;

public class Arraydata {

   
    public static void main(String[] args) {
       ArrayList<String> cars= new ArrayList<String>();
       cars.add("BMW");
       cars.add("Maruti");
       cars.add("Nano");
       cars.set(0, "Hundai");
      System.out.println(cars);
//      the other differnet function used in arraylist are
//       get(index);
//       set(index,value);
//       clear();
//       remove(index);
//       size();
    }
    
}
