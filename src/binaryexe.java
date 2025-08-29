public class binaryexe {
    public static void main(String[] args) {
        BST t = new BST(50);

        t.root = t.insert(t.root, 30);
        t.root = t.insert(t.root, 70);
        t.root = t.insert(t.root, 20);
        t.root = t.insert(t.root, 10);

        System.out.println("Inorder Traversal:");
        t.inorder(t.root);

        System.out.println("\nPostorder Traversal:");
        t.postorder(t.root);
    }
}

// Binary Search Tree class
class BST {
    Node22 root;

    // Constructor with initial root value
    BST(int data) {
        root = new Node22(data);
    }

    // ✅ FIXED: Use Node22 as the return type
    Node22 insert(Node22 root, int data) {
        if (root == null) {
            return new Node22(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    public void inorder(Node22 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorder(Node22 root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

// Node class
class Node22 {
    int data;
    Node22 left, right;

    Node22(int data) {
        this.data = data;
        left = right = null;
    }
}
