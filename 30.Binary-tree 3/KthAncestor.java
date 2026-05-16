class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class KthAncestor {

    static int kthAncestor(Node root, int k, int target) {
        if (root == null)
            return -1;

        // Target found
        if (root.data == target)
            return 0;

        int leftDist = kthAncestor(root.left, k, target);
        int rightDist = kthAncestor(root.right, k, target);

        // Target not found in either subtree
        if (leftDist == -1 && rightDist == -1)
            return -1;

        int dist = Math.max(leftDist, rightDist) + 1;

        if (dist == k) {
            System.out.println("Kth Ancestor is: " + root.data);
        }

        return dist;
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

        int target = 4;
        int k = 2;

        kthAncestor(root, k, target);
    }
}
