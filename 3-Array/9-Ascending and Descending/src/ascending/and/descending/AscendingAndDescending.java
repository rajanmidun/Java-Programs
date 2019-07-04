
package ascending.and.descending;

import java.util.Arrays;

public class AscendingAndDescending {
 //main class starts from here
    public static void main(String[] args) {
        int a[]={2,6,5,34,8,9};
        System.out.println("Given array");
            for(int i:a)
       {
           System.out.print(i+" ");
       }
            //code for ascending order
        System.out.println("\nAscending order");
       Arrays.sort(a);
       for(int i:a)
       {
           System.out.print(i+" ");
       }
       //code for descending order
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
              if(a[i]<a[j]){
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
           }
       
       }
       System.out.println("\nDescending order0");
         for(int i:a)
       {
           System.out.print(i+" ");
       }
    }
    
}
