package Queue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    protected int size;  /// How many element is present
    private int capacity; // maximum element can  present in queue.
    

    public CircularQueue(int capacity) {
        
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }


    // Insertion Operation in the Circular Queue.
    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println(" Queue is Full !!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Dequeue (delete) from the Front section

    public int dequeue() {
        if (size == 0) {
            System.out.println(" Queue is Empty !!");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }
    
    // Display the element of the queue

    public void display() {
        if (size == 0) {
            System.out.println(" Queue is Empty !!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();

    }
}
