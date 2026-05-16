
public class printOddSumUpTo {
    public static void main(String[] args) {
        int n = 20; // You can change this value to test with different numbers
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
        
    }
}
