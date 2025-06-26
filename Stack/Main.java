package Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(4);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.displayElement();

        System.out.println(stack.pop());
        stack.displayElement();
    }
}
