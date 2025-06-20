package Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest(int arr[]) {
        int largest = arr[0];
        int largestsecond = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largestsecond = largest;
                largest = arr[i];
            } else if (arr[i] > largestsecond && arr[i] != largest) {
                largestsecond = arr[i];
            }
        }
        return largestsecond;

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

        int val = findSecondLargest(arr);
        System.out.println(val);
    }
}
 