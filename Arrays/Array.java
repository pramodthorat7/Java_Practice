package Arrays;
import java.util.Arrays;

public class Array {
    public static void main (String [] args){


        int arr[] = { 8, 4, 3, 9, 7, 5, 1, 6 };
        
        Arrays.sort(arr); // Sort the entire Array
        

        // for(int i=0 ; i<arr.length;i++)
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}