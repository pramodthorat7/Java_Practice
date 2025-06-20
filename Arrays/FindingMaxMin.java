package Arrays;
public class FindingMaxMin {
    
    public static void main(String args[]) {
        
        int arr[] = { 8, 4, 3, 9, 7, 5, 1, 6 };

        // int arr[] = { 84, 74, 36, 96, 67, 45, 107, 86 };

        int maximum = arr[0];
        int minimum = arr[0];

        //Using enhanced for loop
        
        
        for (int i : arr) {
            if (i > maximum) maximum = i;
            if (i < minimum) minimum = i; 
            System.out.print(i+" ");
        }
        
           
        /*
        //Using Simple for loop

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            } else if (arr[i] < minimum) {
                minimum = arr[i];
            }

            System.out.print(i + " ");
        }
         */

        System.out.printf("\nMaximum : %d and Minimum : %d", maximum, minimum);
    }
}
