
package sum.of.string.value.which.are.an.integer;

public class SumOfStringValueWhichAreAnInteger {

    
    public static void main(String[] args) {
        
        String data[]={"1","2","3","4"};
        int value[]=new int[4];
        int i=0,total=0;
        for(String s:data)
        {
            value[i]=Integer.parseInt(s);
            total+=value[i];
            i++;
        }
        System.out.println("The sum of array string is "+total);
    }
    
}
