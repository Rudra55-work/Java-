public class reversestring {
    public static void printreverse(String str, int idx) {
        //base case
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printreverse(str, idx - 1);
    }
    public static void main(String[] args) {
        String str = "rudrA vermA";
        printreverse(str, str.length()-1);
    }
    
}
