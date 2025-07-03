package Recursion;

public class TowerofHanoi {
    

    public static void TOH(int n, char source, char helper, char destination) {

        if (n == 1) { // base condition
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;

        }
        TOH(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        TOH(n - 1, helper, source, destination);

    }
    public static void main(String[] args) {
        int n = 4;
        TOH(n, 'A', 'B', 'C');
    }
}
