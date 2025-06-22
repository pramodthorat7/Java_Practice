package Linkedlist;

// import java.util.*;

public class Main {
    public static void main(String[] args) {
        

        LinkedListOps linkedlist = new LinkedListOps();

        linkedlist.insertAtBegin(10);
        linkedlist.insertAtLast(20);
        linkedlist.insertAtLast(30);
        linkedlist.insertAtLast(40);
        linkedlist.insertAtBegin(5);
        linkedlist.insertAtPosition(4,0);
        
        linkedlist.printData();
        
    }
}
