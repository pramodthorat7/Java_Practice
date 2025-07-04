package Trees;

public class Main {
    public static void main(String[] args) {
        

        Node root = new Node(1); // Creating the root node in the tree.

        BinaryTree binaryTree = new BinaryTree(root);


        Node node2 = new Node(2); // first left node in the tree after the root node.
        Node node3 = new Node(3); // first right node in the tree after the root node.

        binaryTree.root.left = node2; // assign the connection between root and left.
        binaryTree.root.right = node3; // assign the connection between root and right. 

        Node node4 = new Node(4);
        binaryTree.root.left.left = node4;

        Node node5 = new Node(5);
        binaryTree.root.left.right = node5;


        Node node6 = new Node(6);
        binaryTree.root.right.right = node6;
        

        System.out.println("PreOrder:");
        binaryTree.preOrder(root);
        System.out.println("\nInorder: ");
        binaryTree.inOrder(root);
        System.out.println("\nPostOrder :");
        binaryTree.postOrder(root);


    }
}
