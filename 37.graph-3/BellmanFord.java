import java.util.*;

class Edge {
    int src, dest, wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public class BellmanFord {

    public static void bellmanFord(ArrayList<Edge> edges, int V, int src) {
        int dist[] = new int[V];

        // Step 1: initialize
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        // Step 2: relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (Edge e : edges) {
                if (dist[e.src] != Integer.MAX_VALUE &&
                    dist[e.src] + e.wt < dist[e.dest]) {
                    
                    dist[e.dest] = dist[e.src] + e.wt;
                }
            }
        }

        // Step 3: detect negative cycle
        for (Edge e : edges) {
            if (dist[e.src] != Integer.MAX_VALUE &&
                dist[e.src] + e.wt < dist[e.dest]) {
                
                System.out.println("Negative weight cycle detected!");
                return;
            }
        }

        // Print result
        System.out.println("Shortest distances:");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(0, 2, 7));
        edges.add(new Edge(1, 2, 8));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(1, 4, -4));
        edges.add(new Edge(2, 3, -3));
        edges.add(new Edge(2, 4, 9));
        edges.add(new Edge(3, 1, -2));
        edges.add(new Edge(4, 0, 2));
        edges.add(new Edge(4, 3, 7));

        bellmanFord(edges, V, 0);
    }
}