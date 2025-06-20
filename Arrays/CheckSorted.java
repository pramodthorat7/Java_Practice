package Arrays;
import java.util.Scanner;

public class CheckSorted {

    public static boolean isSorted(int arr[]) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return isSorted;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        boolean val = isSorted(arr);
        if (val == true)
            System.out.println("Array is Sorted");
        else System.out.println("Array is not Sorted");
    }
}
