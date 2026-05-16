import java.util.*;

public class TopologicalSortBFS {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Function for Topological Sort using BFS
    public static void topSort(ArrayList<Edge>[] graph, int V) {

        int indegree[] = new int[V];

        // Calculate indegree of all vertices
        for(int i = 0; i < V; i++) {
            for(int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        // Add all vertices with indegree 0
        for(int i = 0; i < V; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;

                if(indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // graph edges
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        topSort(graph, V);
    }
}