package ArrayADT;

public class ArrayOps {
    
    public static void main(String args[]) {
        
        ArrayADT array = new ArrayADT(10);

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);

        System.out.println("Array Size: " + array.getsize());
        
        array.update(4, 60);
        array.delete(3);
        array.traverse();


    }
}
