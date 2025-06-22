package Linkedlist;

public class LinkedListOps {
    
    Node head = null;

    // function or Method to insert the node in the linked list at the beginning.


    public void insertAtBegin(int item) {

        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    
    // Insert data at the last.

    public void insertAtLast(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            newNode.next = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    

    // Insert at Specific Position

    public void insertAtPosition(int item, int position) {
        Node newNode = new Node(item);

        if (position < 0) {
            System.out.println("Invalid Position.");
            return;
        }
        if (position == 0) {
            insertAtBegin(item);
        }

        // Move to before specific positon where to add Node.
        Node temp = head;
        int index = 0;
        while (temp.next == null) {
            if (index == position - 1) {
                break;
            }
        }
            temp = temp.next;
            index++;
            
        // Actual insert Operation

        newNode.next = temp.next;
        temp.next = newNode;
    }
    

    public void printData() {
        Node temp = head;
        if (temp == null) {
            System.out.print("Linked List is Empty! ");
        }
        while (temp != null) {
            System.out.print( " ==> "+  temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
