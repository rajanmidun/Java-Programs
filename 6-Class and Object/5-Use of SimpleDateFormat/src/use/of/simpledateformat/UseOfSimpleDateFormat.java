
package use.of.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rajan
 */
public class UseOfSimpleDateFormat {

    
    public static void main(String[] args) {
       
    
        Date date= new Date();
        SimpleDateFormat formatt= new SimpleDateFormat("E\nyyyy:MM:dd G  hh:mm:ss a z");
        System.out.println(formatt.format(date));
    
    }
    
    
}
