class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DiameterOptimized {
//this is info class
    static class Info {
        int height;
        int diameter;

        Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
//////for this info class
/// 
    // O(n) Diameter function
    static Info diameter(Node root) {
        // Base case
        if (root == null) {
            return new Info(0, 0);
        }

        // Get info from left and right subtrees
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        // Height of current node
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        // Diameter options
        int diameterThroughRoot =
                leftInfo.height + rightInfo.height + 1;

        int diameter =
                Math.max(diameterThroughRoot,
                        Math.max(leftInfo.diameter, rightInfo.diameter));

        return new Info(height, diameter);
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

        System.out.println("Diameter of tree: " + diameter(root).diameter);
    }
}
