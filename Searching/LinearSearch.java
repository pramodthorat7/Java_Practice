package Searching;

import java.util.Scanner;

public class LinearSearch {


    public static int search(int array[], int targetElement) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                index = i;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the Target element in the array: ");
        int targetElement = sc.nextInt();

        sc.close();

        int value = search(array,targetElement);
        System.out.printf("The Element is at index : %d ",value);

        // for (int i : array) {
        //     System.out.print(i +" ");
        // }
}
}
