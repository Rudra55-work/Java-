class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class PostorderTraversal {

    // Postorder Traversal Method
    static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);    // Left
        postorder(root.right);   // Right
        System.out.print(root.data + " "); // Root
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \
          4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Postorder Traversal: ");
        postorder(root);
    }
}
