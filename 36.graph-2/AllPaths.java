import java.util.*;

public class AllPaths {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void allPaths(ArrayList<Edge>[] graph, int curr, int target, String path) {

        if(curr == target) {
            System.out.println(path);
            return;
        }

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            allPaths(graph, e.dest, target, path + " -> " + e.dest);
        }
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));

        int src = 0;
        int target = 3;

        allPaths(graph, src, target, "0");
    }
}