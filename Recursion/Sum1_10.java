package Recursion;

public class Sum1_10 {
    

    static int sum(int n) {
        if (n == 1) {
            return n;
        } else {
            
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 20;

        System.out.println(sum(n));
    }
}
