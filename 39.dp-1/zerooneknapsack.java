import java.util.*;

public class zerooneknapsack {

    // ---------------- RECURSION ----------------
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            int exclude = knapsack(val, wt, W, n - 1);

            return Math.max(include, exclude);
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    // ---------------- MEMOIZATION ----------------
    public static int knapsackMemo(int val[], int wt[], int W, int n, int dp[][]) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsackMemo(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapsackMemo(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = knapsackMemo(val, wt, W, n - 1, dp);
        }

        return dp[n][W];
    }

    // ---------------- TABULATION ----------------
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;

        int dp[][] = new int[n + 1][W + 1];

        // Build table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                if (wt[i - 1] <= j) {
                    int include = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        int n = val.length;

        // Memo DP array
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println("Recursion = " + knapsack(val, wt, W, n));
        System.out.println("Memoization = " + knapsackMemo(val, wt, W, n, dp));
        System.out.println("Tabulation = " + knapsackTab(val, wt, W));
    }
}