import java.util.Arrays;

public class climbingStairs {
    // Added the int[] ways parameter to the signature
    public static int climbStairs(int n, int[] ways) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        // Check memoization table
        if (ways[n] != -1) return ways[n];

        // Pass 'ways' into the recursive steps
        ways[n] = climbStairs(n - 1, ways) + climbStairs(n - 2, ways);
        return ways[n];
    }

    public static int climbStairstab(int n) {
        int dp [] = new int[n + 1];
        dp[0] = 1; // Base case: 1 way to climb 0 stairs

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
            dp[i] = dp[i - 1] + 0;
        }else {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
        return dp[n];
}


    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        
        System.out.println("Total ways to climb " + n + " stairs: " + climbStairs(n, ways));
        System.out.println("Total ways to climb " + n + " stairs (tabulation): " + climbStairstab(n));
    }
}