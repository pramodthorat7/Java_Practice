package Arrays;

import java.util.*;



public class LargestElemet {


    public static int findLargest(int arr[]) {
        int largest = arr[0];

        for (int i : arr) {
            if (i > largest)
                largest = i;
        }
        return largest;
    }
    

    public static void main(String args[]) {
        
        // int [] arr = { 90, 80, 10, 20, 50, 75, 67, 42, 91, 37 };
        Scanner sc = new Scanner(System.in);

   

        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();    
        }
        sc.close();


        int value = findLargest(arr);
        System.out.println(value);
        
    }
}
