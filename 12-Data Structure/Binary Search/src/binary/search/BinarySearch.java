package binary.search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {11, 22, 13, 14, 45, 26, 17, 48, 39, 142, 31, 34, 43, 56, 65};
        System.out.println("Enter the value you want to search?");
        int userData = scanner.nextInt();
        sort(array);

        int low = 0;
        int high = array.length - 1;
        binarySearch(array, userData, low, high);
        System.out.println("Array List");
        display(array);
    }

    public static void sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void binarySearch(int a[], int userData, int low, int high) {
        int median = low + (high - low) / 2;
        
        if(low>high){
        System.out.println("Data is not available");
        
        }
        else if(a[median] == userData) {
            System.out.println("Data is available at index " + median);
        } 
        else if (userData < a[median]) {
            high = median - 1;
            binarySearch(a, userData, low, high);
        } 
        else if (userData > a[median]) {
            low = median + 1;
            binarySearch(a, userData, low, high);
        }
    
    }
}
