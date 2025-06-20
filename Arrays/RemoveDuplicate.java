package Arrays;
import java.util.Scanner;

public class RemoveDuplicate { // removes duplicate elements from the sorted arrays

    public static void remove(int arr[]) {
        
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                arr[i + 1] = arr[i + 2]; // In this logic here the index is getting out of the range.
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        remove(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
}
