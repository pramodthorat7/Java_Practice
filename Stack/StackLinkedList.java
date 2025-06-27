package Stack;

public class StackLinkedList {
    
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }


    // Push Operation

    public void push(int data) {
        Node node = new Node(data);

        node.next = top;
        top = node;
    }

    // POP operation

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!");
            return -1;
        } else {
            int value = top.data;
            System.out.println("PoPed Element => "+value);
            top = top.next;
            return value;
        }
    }

    // Peek Opeartion

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty!!");
            return -1;
        } else {
            return top.data;
        }
    }
    
    
    // isEmpty

    public boolean isEmpty() {
        return this.top == null;
    }

    // Display

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty!!");
            return;
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
            System.out.println();
        }
    }
}
