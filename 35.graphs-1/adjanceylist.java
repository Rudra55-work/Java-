import java.util.ArrayList;

public class adjanceylist {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        
    }
    public static void main(String[] args) {
        /*           
      5
0 -------- 1
           / \
        1 /   \ 3
         /     \
        2 ----- 3
         \
          \4
           \
            4
        
        
        */
       int V = 5;
       //int arr[] = new int[V];
       ArrayList<Edge>[] graph = new ArrayList[V];

         for(int i = 0; i < V; i++) {
          graph[i] = new ArrayList<>();
         }
            //0 - vertex
            graph[0].add(new Edge(0, 1, 5));
            //1 - vertex
            graph[1].add(new Edge(1, 0, 5));
            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 3));
            //2 - vertex
            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 4));
            //3 - vertex
            graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));
            //4 - vertex
            graph[4].add(new Edge(4, 2, 2));

            //print the graph
            for(int i = 0; i < graph.length; i++) {
                for(int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    System.out.println("Vertex " + e.src + " is connected to " + e.dest + " with weight " + e.wt);
                }
            }

             
    
    
    
    
        }
}
