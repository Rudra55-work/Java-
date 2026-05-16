import java.util.*;

public class DFSGraph {

    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //0
        graph[0].add(new Edge(0, 1, 5));

        //1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        //3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4
        graph[4].add(new Edge(4, 2, 2));
    }

    // DFS function
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]) {

        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        boolean visited[] = new boolean[V];

        System.out.print("DFS Traversal: ");
        dfs(graph, 0, visited);
    }
}