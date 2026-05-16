public class printinrange {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Helper method to build the tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInrange(Node root, int k1, int k2) {
        if (root == null) return;

        // Case 1: Root is within range
        if (root.data >= k1 && root.data <= k2) {
            printInrange(root.left, k1, k2);
            System.out.print(root.data + " "); // Using print instead of println for cleaner output
            printInrange(root.right, k1, k2);
        } 
        // Case 2: Root is smaller than the range (go right)
        else if (root.data < k1) {
            printInrange(root.right, k1, k2);
        } 
        // Case 3: Root is larger than the range (go left)
        else {
            printInrange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        // Loop to actually build the tree from the array
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Values in range [5, 12]:");
        printInrange(root, 5, 12);
    }
}