public class ValidateBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        // An empty tree is a valid BST
        if (root == null) {
            return true;
        }

        // If current node's value violates the min/max constraint
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }

        // Recursively check subtrees with updated constraints
        // Left subtree: max value becomes current node's data
        // Right subtree: min value becomes current node's data
        return isValidBST(root.left, min,root) &&
               isValidBST(root.right, root,max);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        if (isValidBST(root, null, null)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Invalid BST");
        }
    }
}