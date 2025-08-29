public class treeexmple2 {
    public static void main(String[] args) {
        binary tree = new binary("A");

        tree.insertleft(tree.root, "B");
        tree.insertright(tree.root, "C");

        tree.insertleft(tree.root.left, "D");  // Left child of B
        tree.insertright(tree.root.left, "E"); // Right child of B

        tree.insertleft(tree.root.right, "F");  // Left child of C
        tree.insertright(tree.root.right, "G"); // Right child of C

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}

class Node {
    String data;
    Node left, right;

    Node(String data) {
        this.data = data;
        left = right = null;
    }
}

class binary {
    Node root;

    binary(String data) {
        root = new Node(data);
    }

    void insertleft(Node root, String data) {
        root.left = new Node(data);
    }

    void insertright(Node root, String data) {
        root.right = new Node(data);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
