import java.util.*;

public class SlidingWindowMax {

    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        // Max Heap
        @Override
        public int compareTo(Pair p2) {
            return p2.value - this.value;
        }
    }

    public static int[] maxSlidingWindow(int nums[], int k) {

        int n = nums.length;
        int result[] = new int[n - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 🔹 Step 1: First window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(nums[i], i));
        }

        result[0] = pq.peek().value;

        // 🔹 Step 2: Sliding window
        for (int i = k; i < n; i++) {

            // Add new element
            pq.add(new Pair(nums[i], i));

            // Remove out-of-window elements
            while (pq.peek().index <= i - k) {
                pq.remove();
            }

            // Store max
            result[i - k + 1] = pq.peek().value;
        }

        return result;
    }

    public static void main(String args[]) {

        int nums[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int ans[] = maxSlidingWindow(nums, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}