

public class TargetSumSubset {

    public static boolean targetSumSubset(int arr[], int target) {
        int n = arr.length;

        boolean dp[][] = new boolean[n + 1][target + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {

                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int target = 10;

        System.out.println("Subset exists: " + targetSumSubset(arr, target));
    }
}