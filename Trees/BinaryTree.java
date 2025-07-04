package Trees;

public class BinaryTree {
    Node root;
    


    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }


    // Traversal Operations in the Trees.
    // PreOrder : Root ==> Left ==> Right.

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder : Left ==> Root ==> Right

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // PostOrder : Left ==> Right ==> Root

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
}
