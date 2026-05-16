import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LevelOrderTraversal {

    static void levelOrder(Node root) {
        if (root == null) 
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // level separator

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println(); // move to next line

                if (!q.isEmpty()) {
                    q.add(null); // add separator for next level
                }
                continue;
            }

            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
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
        root.right.right = new Node(6);

        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
