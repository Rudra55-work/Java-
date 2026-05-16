import java.util.*;
public class largestrectarea {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] left = new int[n];   // nearest smaller to left
        int[] right = new int[n];  // nearest smaller to right

        Stack<Integer> s = new Stack<>();

        // 🔹 Step 1: Find Next Smaller to Right (NSR)
        for (int i = n - 1; i >= 0; i--) {

            // Pop until we find smaller element
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            // If stack empty → no smaller on right
            if (s.isEmpty()) {
                right[i] = n;   // imaginary boundary
            } else {
                right[i] = s.peek();
            }

            s.push(i);
        }

        // Clear stack for reuse
        s.clear();

        // 🔹 Step 2: Find Next Smaller to Left (NSL)
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            // If stack empty → no smaller on left
            if (s.isEmpty()) {
                left[i] = -1;  // imaginary boundary
            } else {
                left[i] = s.peek();
            }

            s.push(i);
        }

        // 🔹 Step 3: Calculate Maximum Area
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            // width = right boundary - left boundary - 1
            int width = right[i] - left[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }


public static void main(String args[]) {

        largestrectarea sol = new largestrectarea();

        int heights[] = {2, 1, 5, 6, 2, 3};

        int ans = sol.largestRectangleArea(heights);

        System.out.println(ans);
    }
}