
package hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

   
    public static void main(String[] args) {
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.remove("England");
        for(String data:capitalCities.keySet())
            System.out.println(capitalCities.get(data));
        
    }
    
}
