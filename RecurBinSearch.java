import java.util.Scanner;

public record RecurBinSearch() {

    public static int binarysearch(int arr[], int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                return binarysearch(arr, mid + 1, high, target);
            }

            if (target < arr[mid]) {
                return binarysearch(arr, low, mid - 1, target);
            }

        }
        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the Element you want of find: ");
        int target = sc.nextInt();
        sc.close();

        int low = 0;
        int high = array.length - 1;

        int indexfound = binarysearch(array, low, high, target);

        System.out.println("Element found at Index : " + indexfound);

    }

}
