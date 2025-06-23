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
    // → Last Insert Operation is depend on the length of the linked list. So the complexity is O(n).
   
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

    // Operations : depend on the lenght of the list. So the complexity is O(n).

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
    


    // Print the Linked List Data
    // Operations : O(n) - Linear Time Complexity due to depends on the length of the linked list.


    public void printData() {
        Node temp = head;
        if (temp == null) {
            System.out.print("Linked List is Empty! ");
        }
        while (temp != null) {
            System.out.print(" ==> " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    


    // Delete From the begining 

    // Operations : O(1) - Constant Time Complexity because we are just changing the head pointer.

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("Linked List is Empty!");
        }
        head = head.next;
    }


    // Delete from the last
    // Operations : O(n) - Linear Time Complexity because we are traversing the linked list to find the last node.


    public void deleteAtLast() {
        if (head == null) {
            System.out.println("Linked List is null");
        }

        // for single element linked list
        if (head.next == null) {
            head = null;
        }
        // traverse and reach element
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from specific Location
    // Operations : O(n) - Linear Time Complexity because we are traversing the linked list to find the specific position.

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty !!");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp.next = temp.next.next;
        }
    }


    // Search Data in the Linked List
    // Operations : O(n) - Linear Time Complexity because we are traversing the linked list to find the data.
    // Best case: O(1) - If the data is found at the head.

    
    public boolean searchData(int data) {
        
        Node temp = head;
        
        while (temp != null) {
            boolean result = false;
            if (temp.data == data) {
                // System.out.println("Data found in the Linked List");
                return true;
            }
            temp = temp.next;

        }
        return false;

    }
}
