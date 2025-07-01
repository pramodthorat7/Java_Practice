package Recursion;

public class PrintNumber {
    
    static void printNumber1_10(int n) {
        if (n == 1) {
            System.out.print(n+" ");
        } else {
            printNumber1_10(n - 1);
            System.out.print(n + " ");
        }
    }

    static void printNumber10_1(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.print(n+" ");
            printNumber10_1(n-1);
        }
    }

    public static void main(String[] args) {
        
        int n = 10;
        
        printNumber1_10(n);
        System.out.println();
        printNumber10_1(n);
    }
}
