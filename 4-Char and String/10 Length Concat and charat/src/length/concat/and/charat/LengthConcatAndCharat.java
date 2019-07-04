
package length.concat.and.charat;

/**
 *
 * @author Rajan
 */
public class LengthConcatAndCharat {

    
    public static void main(String[] args) {
        String name="Rajan Midun Magar";
        String address="DhungeAdda , Kathmandu";
        
        System.out.println("Calculating length of the string");
         int lengthName=name.length();
         int lengthAddress=address.length();
        System.out.println("Length of the Name is "+lengthName);
        System.out.println("Length of the Address is "+lengthAddress);
        
        System.out.println("Concate of two string");
           String concationation=name.concat(address);
           System.out.println(concationation);
        
        System.out.println("Character at particular position");
        char positionOfChar=name.charAt(0);
           System.out.println(positionOfChar);
    }
    
}
