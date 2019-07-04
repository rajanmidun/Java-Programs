package check.array.is.balanced.or.not;

public class CheckArrayIsBalancedOrNot {

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int b[] = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 0) {
                if (b[i] % 2 == 0) {
                    c++;
                }
            } 
            else {
                if (b[i]%2!=0) {
                    c++;
                }
            }
           
        }
         if(c==b.length)
                System.out.println("Balanced!!");
            else
                System.out.println("Not Balanced!!");
    }

}
