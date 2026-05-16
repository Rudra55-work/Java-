class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTDelete {

    // Insert
    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Delete Node
    static Node delete(Node root, int key) {
        if (root == null) 
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Find Minimum (Inorder Successor)
    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {

        int values[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Before Deletion:");
        inorder(root);

        int key = 5;  // Node to delete
        root = delete(root, key);

        System.out.println("\nInorder After Deletion:");
        inorder(root);
    }
}
