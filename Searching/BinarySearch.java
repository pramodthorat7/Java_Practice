package Searching;

import java.util.Scanner;

public class BinarySearch {

    public static boolean isSorted(int array[]) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    public static int binarysearch(int arr[], int targetElement) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
        int midIndex = low + (high - low) / 2;
            
            if (arr[midIndex] == targetElement) {
                return midIndex;
            }
            if (arr[midIndex] < targetElement) {
                low = midIndex + 1;
            }
            if (arr[midIndex] > targetElement) {
                high = midIndex - 1;
            }
        }
 
        return -1;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array; ");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int foundIndex = binarysearch(array, target);

        if (isSorted(array) == false) {
            System.out.println("Input array is not Sorted");
        // } else if (binarysearch(array, target) == -1) {
        //     System.out.println("Array is Invalid.");
        } else {
            System.out.println("Element is found at position " + foundIndex);
        }

        sc.close();
    }
}
