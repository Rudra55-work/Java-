public class keypadcomb {
    public static String[] keypad = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void printcomb(String str, String ans, int idx) {
        //base case
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printcomb(str, ans + mapping.charAt(i), idx + 1);
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printcomb(str, "", 0);
    }
    
}
