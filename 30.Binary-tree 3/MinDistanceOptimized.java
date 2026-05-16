class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class MinDistanceOptimized {

    // Step 1: Find LCA
    static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    // Step 2: Find distance from a node to target
    static int findDistance(Node root, int target) {
        if (root == null)
             return -1;

        if (root.data == target) 
            return 0;

        int leftDist = findDistance(root.left, target);
        if (leftDist != -1)
            return leftDist + 1;

        int rightDist = findDistance(root.right, target);
        if (rightDist != -1)
            return rightDist + 1;

        return -1;
    }

    // Step 3: Minimum distance
    static int minDistance(Node root, int n1, int n2) {
        Node lcaNode = lca(root, n1, n2);

        int d1 = findDistance(lcaNode, n1);
        int d2 = findDistance(lcaNode, n2);

        return d1 + d2;
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(minDistance(root, 4, 6)); // Output: 4
    }
}
