import java.util.*;

public class PrimsAlgo {

    static class Edge {
        int dest, wt;

        Edge(int d, int w) {
            this.dest = d;
            this.wt = w;
        }
    }

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

    // Graph creation
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
 
        // undirected graph
        graph[0].add(new Edge(1, 10));
        graph[1].add(new Edge(0, 10));

        graph[0].add(new Edge(2, 15));
        graph[2].add(new Edge(0, 15));

        graph[1].add(new Edge(3, 40));
        graph[3].add(new Edge(1, 40));

        graph[2].add(new Edge(3, 50));
        graph[3].add(new Edge(2, 50));

        graph[1].add(new Edge(2, 5));
        graph[2].add(new Edge(1, 5));
    }

    public static void prims(ArrayList<Edge>[] graph) {

        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0)); // start

        int cost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.node]) {
                visited[curr.node] = true;
                cost += curr.cost;

                for (Edge e : graph[curr.node]) {
                    if (!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("Minimum Cost = " + cost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        prims(graph);
    }
}