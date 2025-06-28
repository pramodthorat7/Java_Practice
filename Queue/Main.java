package Queue;

public class Main {
    public static void main(String[] args) {
        
        // Simple Queue Operations 

        
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
        
        



        
        

    }
}
