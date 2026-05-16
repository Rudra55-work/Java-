import java.util.*;

public class KruskalAlgo {

    static class Edge implements Comparable<Edge> {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }

        public int compareTo(Edge e2) {
            return this.wt - e2.wt; // sort by weight
        }
    }

    static int parent[];
    static int rank[];

    // DSU init
    public static void init(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (x == parent[x]) return x;
        return parent[x] = find(parent[x]); // path compression
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) return;

        if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else if (rank[parA] > rank[parB]) {
            parent[parB] = parA;
        } else {
            parent[parB] = parA;
            rank[parA]++;
        }
    }

    public static int kruskal(ArrayList<Edge> edges, int V) {

        Collections.sort(edges); // step 1

        init(V);

        int mstCost = 0;
        int count = 0;

        for (int i = 0; i < edges.size(); i++) {
            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }

            if (count == V - 1) break;
        }

        return mstCost;
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
        edges.add(new Edge(1, 2, 5));

        System.out.println("MST Cost = " + kruskal(edges, V));
    }
}