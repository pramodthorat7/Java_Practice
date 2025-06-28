package Queue;

public class Main {
    public static void main(String[] args) {
        
        // Simple Queue Operations 

        /* 
        SimpleQueue sq = new SimpleQueue(5);
        sq.enqueue(10);
        sq.enqueue(20);
        sq.enqueue(30);
        sq.enqueue(40);
        sq.enqueue(50);
        sq.display();
        
        sq.dequeue();
        sq.enqueue(10);
        // sq.enqueue(70);
        
        sq.display();
        
        */



        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        cq.display();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        // cq.enqueue(60);
        System.out.println("size : "+cq.size);

        cq.dequeue();
        
        System.out.println("size : " + cq.size);
        cq.enqueue(60);
        cq.display();
        

    }
}
