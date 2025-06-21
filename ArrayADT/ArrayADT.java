package ArrayADT;

public class ArrayADT {

    // Array :=> To Store a data
    private int[] array;
    // Index :=> To keep track of the current index
    private int index;
    // Size :=>  size of the array
    private int size;


    public ArrayADT(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }


    // Insert Operation method

    public void insert(int value) {
        if (index == size) {
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }


    // Delete Method

    public void delete(int deleteIndex) {
        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid Index");
            return;
        }

        for (int i = deleteIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
            index--;
        }
    }
    
    // Search Operation Method

    public int search(int value) {
        int indexResult = -1;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    // Get the data

    public int get(int getIndex) {
        if (getIndex < 0 || getIndex >= this.index) {
            System.out.println("Invalid index");
            return -1;
        }
        return array[getIndex];
    }

    // Traverse 
    public void traverse() {
        for (int i = 0; i < this.index; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    // Update the element

    public void update(int updateindex, int value) {
        if (updateindex < 0 || updateindex >= index) {
            System.out.println("Invalid Index");
            return;
        }
        array[updateindex] = value;
    }


    // Size of the array
    public int getsize() {
        return this.index;
    }

}
