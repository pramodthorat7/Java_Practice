package Stack;

public class StackLinkedMain {
    public static void main(String[] args) {
        
        // Create the Object of StackLinkedList and perform operations like push, pop peek and dispaly which are defined in StackLinkedList.java 
        StackLinkedList stacklinkedlist = new StackLinkedList();

        stacklinkedlist.push(10);
        stacklinkedlist.push(20);
        stacklinkedlist.push(30);
        stacklinkedlist.display();

        stacklinkedlist.pop();

        stacklinkedlist.display();
    }
}
