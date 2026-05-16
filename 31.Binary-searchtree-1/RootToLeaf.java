import java.util.*;

public class RootToLeaf {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to the path
        path.add(root.data);

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            // Otherwise, continue traversing
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        // Backtrack: remove the current node before going back up
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + (i == path.size() - 1 ? "" : " -> "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
                  8
                /   \
               5     10
              / \      \
             3   6      14
        */
        Node root = new Node(8);
        root.left = new Node(5); 
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(14);

        System.out.println("Root to Leaf Paths:");
        printRoot2Leaf(root, new ArrayList<>());
    }
}