public class MirrorBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createMirror(Node root) {
        // Base case: if tree is empty
        if (root == null) {
            return null;
        }

        // Recursively mirror the left and right subtrees
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        // Swap the children
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Helper to see the result (Inorder traversal)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
                  8                  8
                /   \              /   \
               5     10    ->     10    5
              / \                  \   / \
             3   6                 14 6   3
        */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root = createMirror(root);

        System.out.println("Preorder traversal of mirrored tree:");
        preorder(root); 
        // Expected Output: 8 10 5 6 3 
    }
}