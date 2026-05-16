import java.util.*;

public class CycleDirected {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static boolean isCycle(ArrayList<Edge>[] graph, boolean visited[], boolean recStack[], int curr) {

        visited[curr] = true;
        recStack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            // If neighbor is in recursion stack → cycle
            if(recStack[e.dest]) {
                return true;
            }

            // If neighbor not visited → DFS
            if(!visited[e.dest]) {
                if(isCycle(graph, visited, recStack, e.dest)) {
                    return true;
                }
            }
        }

        recStack[curr] = false; // remove from recursion stack
        return false;
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1)); // creates cycle

        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];

        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(isCycle(graph, visited, recStack, i)) {
                    System.out.println("Cycle Exists");
                    return;
                }
            }
        }

        System.out.println("No Cycle");
    }
}