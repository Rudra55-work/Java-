import java.util.*;

public class ConnectingCities {

    static class Pair implements Comparable<Pair> {
        int node, cost;

        Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // min heap
        }
    }

    public static int connectCities(int[][] cost) {
        int n = cost.length;

        boolean visited[] = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0)); // start from city 0

        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.node]) {
                visited[curr.node] = true;
                finalCost += curr.cost;

                // explore neighbors
                for (int i = 0; i < n; i++) {
                    if (cost[curr.node][i] != 0 && !visited[i]) {
                        pq.add(new Pair(i, cost[curr.node][i]));
                    }
                }
            }
        }

        return finalCost;
    }

    public static void main(String[] args) {
        int cost[][] = {
            {0, 1, 2, 3, 4},
            {1, 0, 5, 0, 7},
            {2, 5, 0, 6, 0},
            {3, 0, 6, 0, 0},
            {4, 7, 0, 0, 0},
            
        };

        System.out.println(connectCities(cost));
    }
}