package Arrays;
import java.util.Scanner;

public class Move0toLast {

    public static void MoveZerotoLast(int arr[]) {
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
 
        while (index<arr.length) {
                    arr[index] = 0;
                    index++;
        }
            
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

        MoveZerotoLast(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}
