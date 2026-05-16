import java.util.*;

public class cycleUndirected {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    // DFS function for cycle detection
    public static boolean detectCycle(ArrayList<Edge>[] graph, boolean visited[], int curr, int parent) {

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            // Case 1: If neighbor not visited → DFS
            if(!visited[e.dest]) {
                if(detectCycle(graph, visited, e.dest, curr)) {
                    return true;
                }
            }

            // Case 2: If visited and not parent → cycle
            else if(visited[e.dest] && e.dest != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph edges
        /*
            0 ----- 1
            |       |
            |       |
            3 ----- 2
        */
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));

        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));

        graph[3].add(new Edge(3,0));
        graph[0].add(new Edge(0,3));

        boolean visited[] = new boolean[V];

        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(detectCycle(graph, visited, i, -1)) {
                    System.out.println("Cycle Exists");
                    return;
                }
            }
        }

        System.out.println("No Cycle");
    }
}