package Stack;

public class balancedParanthesis {
    public static boolean isBalanced(String experession) {
        
        Stack stack = new Stack(experession.length());

        for (int i = 0; i < experession.length(); i++) {
            char ch = experession.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                
                if (stack.isEmpty()) {
                    return false;
                }

                char top = ((char) stack.pop());
                
                if ((top == '{' && ch == '}' || top == '[' && ch == ']' || top == '(' && ch == ')' )) {
                    return true;
                } else
                    return false;
                
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        
        System.out.println(isBalanced("((1{3[]47})9)"));

        // String reve = "Samadhan";
        // System.out.println(reve.length());;
        // for (int i = 7; i >= 0; i--) {
        //     System.out.print(reve.charAt(i)+" ");
        // }
    }
}
