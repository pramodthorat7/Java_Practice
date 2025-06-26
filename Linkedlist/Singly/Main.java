package Singly;

import java.util.*;

public class Main {

    public static void printMenu() {
        System.out.println("***************MENU***************");
        System.out.println("Enter 1 to INSERT ");
        System.out.println("Enter 2 to DELETE ");
        System.out.println("Enter 3 to SEARCH ");
        System.out.println("Enter 4 to DISPLAY ");
        System.out.println("Enter 5 to EXIT ");

        System.out.println("Enter your choice: ");
        System.out.println("**********************************");
    }
    
    public static void printInsertMenu() {
        System.out.println("Press 1 to insert at head");
        System.out.println("Press 2 to insert at tail");
        System.out.println("Press 3 to insert at a specific position");
    }

    public static void printDeleteMenu() {
        System.out.println("Press 1 to delete at head");
        System.out.println("Press 2 to delete at tail");
        System.out.println("Press 3 to delete at a specific position");
        
    }



    public static void main(String[] args) {

        System.out.println("**********Welcome to Linked List App**********");
        LinkedListOps linkedlist = new LinkedListOps();

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                printMenu();
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insertLinkedList(linkedlist);
                        break;
                
                    case 2:
                        deleteLinkedList(linkedlist);
                        break;

                    case 3:
                        System.out.println("Enter the data your want to search: ");
                        int data = sc.nextInt();

                        boolean result = linkedlist.searchData(data);
                        if (result) {
                            System.out.println("Data found in the linked list.");
                        } else {
                            System.out.println("Data not found in the linked list.");
                        }
                        break;
                    
                    case 4:
                        linkedlist.printData();
                        break;
                    
                    case 5:
                        System.out.println("Thank you for usign APP!!!");
                        System.exit(0);       
                        break;
                    
                    default:
                        System.out.println("Invalid Choice...");

                }
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void insertLinkedList(LinkedListOps linkedlist) {
        printInsertMenu();
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the data : ");
                int data = sc.nextInt();
                linkedlist.insertAtBegin(data);
                break;

            case 2:
                System.out.println("Enter the data : ");
                int data1 = sc.nextInt();
                linkedlist.insertAtLast(data1);
                break;

            case 3:
                System.out.println("Enter the data : ");
                int data2 = sc.nextInt();
                System.out.println("Enter the Position: ");
                int pos = sc.nextInt();
                linkedlist.insertAtPosition(data2, pos);

            default:
                System.out.println("Invalid Choice...");
                break;
        }
    }
    
    private static void deleteLinkedList(LinkedListOps linkedList) {

        printDeleteMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter delete Choice ??");
        int deleteChoice = scanner.nextInt();
        if (deleteChoice == 1) {
            linkedList.deleteAtBegin();
            System.out.println("Deleted !!");
        } 
        else if (deleteChoice == 2) {
            linkedList.deleteAtLast();
            System.out.println("Deleted !!");
        } 
        else if (deleteChoice == 3) {
            System.out.println("Enter the position :");
            int position = scanner.nextInt();
            linkedList.deleteAtPosition(position);
            System.out.println("Deleted !!");
        } 
        else {
            System.out.println("Invalid Delete Choice !");
        }

    }
}
