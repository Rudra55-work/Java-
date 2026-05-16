import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    static Node lca2(Node root, int n1, int n2) {
    if(root == null) {
        return null;
    }
    if(root.data == n1 || root.data == n2) {
        return root;
    }

    Node leftLCA = lca2(root.left, n1, n2);
    Node rightLCA = lca2(root.right, n1, n2);

    //leftLCA=VAL rightLCA=null
    if(rightLCA == null) {
        return leftLCA;
    }
    //leftLCA=null rightLCA=VAL
    if(leftLCA == null) {
        return rightLCA;
    }
    return root; //leftLCA=VAL rightLCA=VAL
    }


    //     static boolean getPath(Node root, int n, ArrayList<Node> path) {
    //         if (root == null) {
    //             return false;
    //         }
    
    //         path.add(root);
    
    //         if (root.data == n) {
    //             return true;
    //         }
    
    //         if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
    //             return true;
    //         }
    
    //         // backtrack
    //         path.remove(path.size() - 1);
    //         return false;
    //     }
    // static Node lca(Node root, int n1, int n2) {
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     //last common node in both paths is the LCA
    //     int i = 0;
    //     for (; i < path1.size() && i < path2.size(); i++) {
    //         if (path1.get(i) != path2.get(i)) {
    //             break;
    //         }
    //     }

    //     Node lca = path1.get(i - 1);
    //     return lca;
    // }  
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Node ans = lca(root, 4, 5);
        Node ans = lca2(root, 4, 5);
        System.out.println("LCA is: " + ans.data);
    }
}
