package Trees.BinarySearchTree;

public class BST {
    
    Node root;

    public BST() {
        this.root = null;
    }

    public BST(Node root) {
        this.root = root;
    }
    

    // Insertion Operation

    private Node insert(Node root, int data) {
        if (root == null) {
            Node node = new Node(data);
            return node;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }
    
    public void insert(int data) {
        root = this.insert(root, data);
    }


    // Delete Operations

    private Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Case No.1 Node with no Child
            if (root.left == null) {
                return root.right;
            }
            // Case No.2 Node with 1 Child
            if (root.left == null) {
                return root.left;
            } else if (root.right == null) {
                return root.right;
            }
            // Case No.3 Node with 2 Child
            else {
                Node successor = findMin(root.right);

                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }
    
    public Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }


    // Search Operations 
    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }

        // if (data < root.data) {
        //     return search(root.left, data);
        // } else {
        //     return search(root.right, data);
        // }

        return data < root.data ? search(root.left, data) : search(root.right, data);
    }

    public boolean search(int data) {
        return search(root, data);
    }
    // Traversing through the tree.

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
        System.out.print(node.data + " ");
    }
}
