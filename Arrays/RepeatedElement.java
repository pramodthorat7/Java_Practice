package Arrays;
import java.util.Scanner;

public class RepeatedElement {

    public static int findRepeated(int arr[], int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        // int arr[] = { 8, 4, 3, 9, 4, 7, 8, 5, 1, 6, 8 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Element : ");
        int target = sc.nextInt();
        sc.close();

        int val = findRepeated(arr, target);
        System.out.println(val);

    }
}

