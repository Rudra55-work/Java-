    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class preordertraversal {

    // Preorder Traversal Method
    static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " "); // Root
        preorder(root.left);              // Left
        preorder(root.right);             // Right
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

        System.out.print("Preorder Traversal: ");
        preorder(root);
    }
}


