package date.and.time;

import java.util.Date;
import java.text.*;

public class DateAndTime {
    public static void main(String[] args) {
       Date date= new Date();
       // SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd G");
        //System.out.println(format.format(date));
        String format= String.format("%s",date);
       System.out.println(format.format(format));
   
       
    }
    
}
