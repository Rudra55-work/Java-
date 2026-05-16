class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SumOfNodes {

    static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return sumNodes(root.left) + sumNodes(root.right) + root.data;
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

        System.out.println("Sum of Nodes: " + sumNodes(root));
    }
}
