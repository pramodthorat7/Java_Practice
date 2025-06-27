package Stack;

public class StackLinkedMain {
    public static void main(String[] args) {
        
        StackLinkedList stacklinkedlist = new StackLinkedList();

        stacklinkedlist.push(10);
        stacklinkedlist.push(20);
        stacklinkedlist.push(30);
        stacklinkedlist.display();

        stacklinkedlist.pop();

        stacklinkedlist.display();
    }
}
