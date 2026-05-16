public class LargestBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBSTSize = 0;

    public static Info getLargestBST(Node root) {
        // Base case: null nodes are BSTs of size 0
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursive calls for left and right subtrees
        Info leftInfo = getLargestBST(root.left);
        Info rightInfo = getLargestBST(root.right);

        // Current node's stats
        int size = leftInfo.size + rightInfo.size + 1;

        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // Check BST conditions
        if (leftInfo.isBST && rightInfo.isBST && 
            root.data > leftInfo.max && root.data < rightInfo.min) {
            
            maxBSTSize = Math.max(maxBSTSize, size);
            return new Info(true, size, min, max);
        }

        // If not a BST, return false for isBST
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        /*
                    50
                  /    \
                30      60
               /  \    /  \
              5   20  45   70
                          /  \
                         65   80
        */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
                 60
                /  \
               45   70
                   /  \
                  65  80
        expected bst size = 5
        */

        getLargestBST(root);
        System.out.println("Size of Largest BST: " + maxBSTSize);
    }
}