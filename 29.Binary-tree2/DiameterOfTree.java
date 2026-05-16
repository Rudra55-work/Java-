class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DiameterOfTree {

    // Height of tree
    static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // Diameter (O(n^2))
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        // Diameter of left subtree
        int leftDiameter = diameter(root.left);

        // Diameter of right subtree
        int rightDiameter = diameter(root.right);

        // Diameter through root
        int rootDiameter = height(root.left) + height(root.right) + 1;

        // Maximum of all
        return Math.max(rootDiameter,
                Math.max(leftDiameter, rightDiameter));
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

        System.out.println("Diameter of tree: " + diameter(root));
    }
}
