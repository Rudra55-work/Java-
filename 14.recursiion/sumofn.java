public class sumofn {
    public static void printsum(int i ,int n, int sum) {
        //base case
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i + 1, n, sum);        
        
    }
    public static void main(String[] args) {
        printsum(1, 5, 0);
    }
    
}
