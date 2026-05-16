

public class startswithproblem {
         static class Trie {

    class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    Node root;

    public Trie() {
        root = new Node();
    }

    // Insert word
    public void insert(String word) {
        Node curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search exact word
    public boolean search(String word) {
        Node curr = root;

        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
    }

    // StartsWith function
    public boolean startsWith(String prefix) {
        Node curr = root;

        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
}

        public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true

        trie.insert("app");

        System.out.println(trie.search("app"));     // true
    }
}
