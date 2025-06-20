package Arrays;
import java.util.Scanner;

public class SumOfArray {

    public static int sum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String args[]) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
    
        System.out.println("Enter the Element of the Array: ");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();


        int sum = sum(arr);
        System.out.println("Sum of Array: "+ sum);

    }
}
