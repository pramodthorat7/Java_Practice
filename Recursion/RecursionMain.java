package Recursion;

public class RecursionMain {

    public static void printNum(int n) {
        if (n == 1) {
            System.out.println("1");
        } else {
            System.out.println(n);
            printNum(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution Started : ");
        printNum(5);
    }
}
