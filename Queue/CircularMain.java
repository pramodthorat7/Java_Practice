package Queue;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        cq.display();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        // cq.enqueue(60);
        System.out.println("size : " + cq.size);

        cq.dequeue();

        System.out.println("size : " + cq.size);
        cq.enqueue(60);
        cq.display();
    }
}
