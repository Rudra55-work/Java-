public class LongestWordWithAllPrefixes {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    static Node root = new Node();
    static String ans = "";

    // Insert word
    public static void insert(String word) {
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

    // DFS to find longest word
    public static void dfs(Node node, StringBuilder temp) {

        for(int i = 0; i < 26; i++) {
            if(node.children[i] != null && node.children[i].eow == true) {

                char ch = (char)(i + 'a');
                temp.append(ch);

                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                dfs(node.children[i], temp);

                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {

        String[] words = {"a","banana","app","appl","ap","apply","apple"};

        for(String word : words) {
            insert(word);
        }

        dfs(root, new StringBuilder());

        System.out.println(ans);
    }
}