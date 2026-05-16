public class allsubsequences {
    public static void printSubsequences(String str, String ans, int idx) {
        //base case
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }
        char currentChar = str.charAt(idx);
        //include the character
        printSubsequences(str, ans + currentChar, idx + 1);
        //exclude the character
        printSubsequences(str, ans, idx + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "", 0);
    }
    
}
