import java.util.*;

public class TopologicalSortDFS {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void topoSort(ArrayList<Edge>[] graph) {

        boolean visited[] = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++) {
            if(!visited[i]) {
                dfs(graph, i, visited, stack);
            }
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[], Stack<Integer> stack) {

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visited[e.dest]) {
                dfs(graph, e.dest, visited, stack);
            }
        }

        stack.push(curr);
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        topoSort(graph);
    }
}