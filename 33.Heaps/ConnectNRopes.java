import java.util.*;

public class ConnectNRopes {

    public static int minCost(int ropes[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add all ropes to min heap
        for (int rope : ropes) {
            pq.add(rope);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            cost += sum;

            pq.add(sum);
        }

        return cost;
    }

    public static void main(String args[]) {
        int ropes[] = {4, 3, 2, 6};

        System.out.println("Minimum Cost: " + minCost(ropes));
    }
}
