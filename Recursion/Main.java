package Recursion;

public class Main {

    // Stack is used for every Recursion case or call.

    public static String reverse(String s) {
        if (s.isEmpty())
            return s;
        System.out.println(s.substring(1));

        return reverse(s.substring(1)) + s.charAt(0);

    }
    
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
    }
}
