package Recursion;

public class nCr {
    
    static int fact(int a) {
        if (a == 0 || a == 1)
            return 1;

        else {
            return a * fact(a - 1);
        }
    }

    static int ncrRecursive(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        else 
            return ncrRecursive(n - 1, r - 1) + ncrRecursive(n - 1, r);
    }

    static int nCrgeneral(int n, int r) {
        if (r > n)
            return 0;

        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n - r);
        return factN / (factR * factNR);
    }

    public static void main(String[] args) {
        int n = 4;
        // int r = 2;
        // System.out.println(nCrgeneral(n, r));

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ncrRecursive(i, j) + " ");
            }
            System.out.println();
        }
        
    }
}
