package Queue;

public class SimpleQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;


    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }



    // Insert data at the rear   == ENQUEUE
    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is Full!!");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data + " is inserted in the queue.");
    }

    // DEQUEUE == remove the element from the front end.

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int data = queue[front];
        front++;
        return data;

    }

    // Peek at front

    public int peekfront() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }


    // Peek at End

    public int peekend() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[rear];
    }

    // Display element.

    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
