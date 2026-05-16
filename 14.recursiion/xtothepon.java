public class xtothepon {
    public static int xToThePown(int x, int n) {
        //base case
        if (n == 0) {
            return 1;
        }
        if (x==0) {
            return 0;
            
        }
        int xPownm1 =  xToThePown(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = xToThePown(x, n);
        System.out.println(x + " to the power of " + n + " is " + result);
    }
    
}
