package linear.search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {12, 15, 14, 13, 167, 15, 134, 17, 97, 756, 5, 44};
        int counter=0;
        System.out.println("Enter the value you want to search");
        int userData = scanner.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (userData == array[i]) {
                System.out.println("Your data "+userData+" is present in index "+i);
            }
            else
                counter++;
        }
        if(counter==array.length)
            System.out.println("Data is not available");

    }
}
