public class CircularLinkedList {
    
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }


    // Add the data at the front (head)

    public void addFront(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;

            head.next = head;
            head.prev = head;

        } else {
            newNode.next = head;
            head.prev = newNode;

            newNode.prev = tail;
            tail.next = newNode;

        }
    }
    
    // Add the data to the END

    public void addEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            this.head = newNode;
            this.tail = newNode;

            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;

            tail.next = newNode;
            head.prev = newNode;

            tail = newNode;
        }
    }
    
    // Delete from the Front

    public void deleteFront() {
        if (head == null) {
            System.out.println(" Empty List!!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }
    
    // Delete form the Tail

    public void deleteEnd() {
        if (head == null) {
            System.out.println(" Empty List!!");
            return;
        }
        if (head == null) {
            this.head = null;
            this.tail = null;
        }

        else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    // Display forward 

    public void displayForward() {
        if (head == null) {
            System.out.println("List is Empty!!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " \t");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is Empty!!");
            return;
        }
        
        Node temp = tail;
        do{
            System.out.println(temp.data+ "\t");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();

    }
}
