package Queue;

public class DoubleMain {
    public static void main(String[] args) {
        DoubleQueue dq = new DoubleQueue(5);

        dq.insertFront(10);
        dq.insertFront(20);
        dq.insertRear(30);
        dq.insertFront(45);

        dq.display();

        System.out.println("Rear Data : "+ dq.getRear());
        System.out.println("Front Data : " + dq.getFront());
        
        System.out.println("Element deleted : "+ dq.deleteFront());;
        dq.insertRear(50);
        dq.insertFront(40);

        dq.display();

        System.out.println("Rear Data : " + dq.getRear());
        System.out.println("Front Data : " + dq.getFront());

    }
}
