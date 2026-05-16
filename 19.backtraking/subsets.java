public class subsets {
    public static void printSubsets(String str, String ans, int index) {
        // base case
        if (index == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }else{System.out.println(ans);
            }
            
            return;
        }

        // yes choice
        printSubsets(str, ans + str.charAt(index), index + 1);

        // exclude the character at the current index
        printSubsets(str, ans, index + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);

    }
}
