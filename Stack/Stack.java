package Stack;

public class Stack {
    
    private int[] array;
    private int maxSize;
    private int top = -1;

    public Stack(int size) {
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }


    // Push Operations 

    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is Full!!");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }

    // Display the stack

    public void displayElement() {
        if (top == -1) {
            System.out.println("The stack is Empty!!");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // isEmpty

    public boolean isEmpty() {
        return top == -1;
    }


    // Pop Operations

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!");
            return -1;
        } else {
            int popElement = array[top];
            top--;
            return popElement;
        }
    }

    // Peek Operation


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!");
            return -1;
        } else {
            return array[top];
        }
    }
}
