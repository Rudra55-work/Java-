public class permutation {
    public static void printpermutation(String str, String ans) {
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, ans + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, "");
    }
    
}
