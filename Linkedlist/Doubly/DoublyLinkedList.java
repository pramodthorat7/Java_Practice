package Linkedlist.Doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;

    }

    // Add the data to the front 

    public void addFront(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add the data to the Last

    public void addEnd(int data) {

        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add the data at Position

    // Delete at the front

    public void deleteFront() {
        if (head == null) {
            System.out.println("List is Empty !!");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteEnd() {
        if (tail == null) {
            System.out.println("List is Empty!!");
        }

        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    
    // Display Backward 

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Display Forward

    // public void displayForward() {
    //     Node current = head;
    //     while (current != null) {
    //         System.out.print(current.data + " ");
    //         current = current.next;
    //     }
    //     System.out.println();
    // }

}

