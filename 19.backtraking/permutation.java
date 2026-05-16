public class permutation {
    public static void printPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursive case
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
    
}
