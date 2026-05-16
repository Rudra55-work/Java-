public class recursion1 {
    static void printNumbers(int n) {
        //base case
        if(n == 0) {
            return;
        }
        //print after returning from recursion
        System.out.println(n + " ");
        //recursive call
        printNumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
