class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SumTree {

    static int transform(Node root) {
        if (root == null)
            return 0;

        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

        int oldValue = root.data;
        root.data = leftSum + rightSum;

        return oldValue + root.data;
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        /*
                10
               /  \
              5    3
        */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(3);

        transform(root);

        System.out.print("Inorder of Sum Tree: ");
        inorder(root);
    }
}
