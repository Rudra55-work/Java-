public class countuniquesubstrings {
    static class Node {
        Node[] children = new Node[26];
    }

    static Node root = new Node();

    // Insert suffix
    public static void insert(String word) {
        Node curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
    }

    // Count nodes in Trie
    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {

        String str = "ababa";

        // Insert all suffixes
        for(int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }

        int result = countNodes(root) - 1;

        System.out.println("Unique substrings: " + result);
    }
}

