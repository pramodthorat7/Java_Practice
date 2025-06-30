package Stack;

public class RevStrStack {
    

    // Reverse the String using Stack.

    public static String reverseString(String str) {
        Stack stack = new Stack(str.length());

        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            result.append((char) pop);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String rs = reverseString("Hello");
        System.out.println(rs);
    }
}
