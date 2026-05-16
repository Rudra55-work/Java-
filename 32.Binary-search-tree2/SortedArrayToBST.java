public class SortedArrayToBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createBST(int arr[], int start, int end) {
        // Base case: if start index exceeds end index
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = (start + end) / 2;

        // Create the root node with the middle element
        Node root = new Node(arr[mid]);

        // Recursively build the left and right subtrees
        root.left = createBST(arr, start, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        
        /* Expected Balanced BST:
                  8
                /   \
               5     11
              / \    / \
             3   6  10  12
        */

        Node root = createBST(arr, 0, arr.length - 1);
        
        System.out.println("Preorder Traversal of Balanced BST:");
        preorder(root);
    }
}