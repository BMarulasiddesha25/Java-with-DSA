public class treeeexample {
    public static void main(String[] args) {
        Node13 root = new Node13(1);
        Node13 h1 = new Node13(2);
        Node13 h2 = new Node13(3);

        root.left = h1;
        root.right = h2;
        System.out.println("pre order traversal of the tree");
       // System.out.println("In order traversal of the tree");
       // System.out.println("post order traversal of the tree");
        inorder(root);
    }

    public static void inorder(Node13 root) {
        if (root != null) {
            System.out.println(root.data + " ");  //pre type
            inorder(root.left);
            //System.out.println(root.data + " ");  //inorder type
            inorder(root.right);
           // System.out.println(root.data + " ");  //post type
        }
    }
}

class Node13 {
    int data;
    Node13 left;
    Node13 right;

    Node13(int data) {
        this.data = data;
        left = right = null;
    }
}
