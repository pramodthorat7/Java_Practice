package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static String Reverse(int arr[]) {
        int temp=0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        String value = Arrays.toString(arr);
        return value;
    }

    
    public static void main(String args[]) {
        
        // int arr[] = { 8, 4, 3, 9, 7, 5, 1, 6 };
        // int arr[] = { 84, 74, 36, 96, 67, 45, 107, 86 };

        
        // Using Simple reverse loop
        
        /* 
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
    
        System.out.println("Enter the Element of the Array: ");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();


        for (int i : arr) {
            System.out.print(i + " ");
        }

        String val = Reverse(arr);
        System.out.println(val);


    }
}
