package Linkedlist;

public class Main1 {
    public static void main(String[] args) {
        
        Node node1 = new Node(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node node2 = new Node(20);
        node1.next = node2;
        System.out.println(node1.next);

        System.out.println(node2.data);
        // System.out.println(node2.next);
    }
}
