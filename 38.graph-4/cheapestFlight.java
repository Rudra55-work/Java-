import java.util.*;

public class cheapestFlight {

    static class Edge {
        int src, dst, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int flights[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dst = flights[i][1];
            int wt = flights[i][2];

            graph[src].add(new Edge(src, dst, wt));
        }
    }

    static class Info {
        int v, cost, stops;

        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int flights[][], int src, int dst, int k) {

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flights);

        int dist[] = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)); // (node, cost, stops)

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (curr.stops > k) continue;

            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);

                int u = e.src;
                int v = e.dst;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE &&
                    dist[u] + wt < dist[v] &&
                    curr.stops <= k) {

                    dist[v] = dist[u] + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] flights = {
            {0,1,100},
            {1,2,100},
            {2,0,100},
            {1,3,600},
            {2,3,200}
        };

        int src = 0, dst = 3, k = 1;

        int ans = cheapestFlight(n, flights, src, dst, k);
        System.out.println(ans);
    }
}