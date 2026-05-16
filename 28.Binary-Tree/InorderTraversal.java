class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InorderTraversal {

    // Inorder Traversal Method
    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);               // Left
        System.out.print(root.data + " "); // Root
        inorder(root.right);              // Right
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

        System.out.print("Inorder Traversal: ");
        inorder(root);
    }
}
