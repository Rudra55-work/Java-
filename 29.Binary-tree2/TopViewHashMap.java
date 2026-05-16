import java.util.*;

public class TopViewHashMap {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void topView(Node root) {
        if (root == null) return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int minHD = 0, maxHD = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            // store first node at this HD
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }

            minHD = Math.min(minHD, curr.hd);
            maxHD = Math.max(maxHD, curr.hd);

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }

        // print top view from leftmost to rightmost
        for (int i = minHD; i <= maxHD; i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void main(String[] args) {

        /*
                    1
                   / \
                  2   3
                   \
                    4
                     \
                      5
                       \
                        6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);
    }
}
