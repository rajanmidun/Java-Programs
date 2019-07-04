
package check.the.pkgchar.is.letter.or.number;

public class CheckTheCharIsLetterOrNumber {

    public static void main(String[] args) {
       
        char data[]={'1','a',};
        for(char c:data)
        {
             if(Character.isLetter(c))
                 System.out.println(c+" is Letter");
             else
                 System.out.println(c+" is Number");
        }
        System.out.println("Example using to string");
        System.out.println(Character.toString(data[0]));
    }
    
}
