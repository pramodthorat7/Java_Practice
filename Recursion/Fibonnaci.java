package Recursion;

public class Fibonnaci {
    

    static int fibbo(int n) {
        if (n == 0) 
            return 0;

        if (n == 1)
            return 1;
        else {
            return fibbo(n - 1) + fibbo(n - 2);   // Two recursion function will be performend for each one
        }
    }

    public static void main(String[] args) {
        for(int i =0; i<10 ;i++){
            System.out.println(fibbo(i));
        }
    }
}
