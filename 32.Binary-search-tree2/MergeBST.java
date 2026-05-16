import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class MergeBST {

    // Inorder traversal (store sorted values)
    static void inorder(Node root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Merge two sorted lists
    static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }

        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        return merged;
    }

    // Convert sorted array to balanced BST
    static Node sortedArrayToBST(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));

        root.left = sortedArrayToBST(list, start, mid - 1);
        root.right = sortedArrayToBST(list, mid + 1, end);

        return root;
    }

    // Merge two BSTs
    static Node mergeBSTs(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        List<Integer> mergedList = mergeLists(list1, list2);

        return sortedArrayToBST(mergedList, 0, mergedList.size() - 1);
    }

    // Preorder print (for checking)
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // First BST
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // Second BST
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = mergeBSTs(root1, root2);

        System.out.println("Preorder of Merged BST:");
        preorder(mergedRoot);
    }
}
