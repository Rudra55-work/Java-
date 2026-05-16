import java.util.*;

public class RebalanceBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Step 1: Get Inorder Sequence (Sorted)
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // Step 2: Build Balanced BST from Sorted List
    public static Node createBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        Node root = new Node(inorder.get(mid));

        root.left = createBST(inorder, start, mid - 1);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    public static Node balanceBST(Node root) {
        // Get the sorted sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // Rebuild the tree
        return createBST(inorder, 0, inorder.size() - 1);
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
               Unbalanced BST:
                     8
                    /
                   6
                  /
                 5
                /
               3
        */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root = balanceBST(root);

        System.out.println("Preorder Traversal of balanced BST:");
        preorder(root);
        // Expected: 5 3 6 8 (or similar balanced structure)
    }
}