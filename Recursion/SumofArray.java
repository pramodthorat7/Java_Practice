package Recursion;

public class SumofArray {
    

    static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        System.out.println(sumArray(arr, arr.length));
    }
}
