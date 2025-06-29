package Queue;

public class DoubleQueue {
    private int[] arr;
    private int capacity; // Size of the Queue
    private int front;
    private int rear;
    private int size; // This is to track the elements of the queue. or Current element


    public DoubleQueue(int capacity) {
        this.capacity = capacity;

        arr = new int[this.capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Check for Empty Queue

    public boolean isEmpty() {
        return size == 0; // Returns the true if the size is 0 of the queue.
    }

    public void insertFront(int data) {
        // Check if the Queue is Full
        if (size == capacity) {
            System.out.println("Queue is Full!!");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        arr[front] = data;
        size++;
    }
    
    // Insertion at the rear End

    public void insertRear(int data) {
        if (size == capacity) {
            System.out.println("Queue is Full!!");
            return;
        }
        
        if(isEmpty()){
            front =0;
            rear =0;
        }
        else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = data;
        size++;
    }

    // Delete from the Front

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int data = arr[front];

        if (front == rear) {
            rear = -1;
            front = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return data;
    }


    // Delete from the Rear End
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int data = arr[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return data;
    }

    // Element from the front

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // Element from the End

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}