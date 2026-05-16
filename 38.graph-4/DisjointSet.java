import java.util.*;

public class DisjointSet {

    static int parent[];
    static int rank[];

    // Initialize
    public static void init(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i; // each node is its own parent
            rank[i] = 0;
        }
    }

    // Find with path compression
    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]); // path compression
    }

    // Union by rank
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

    public static void main(String[] args) {
        init(5);

        union(0, 1);
        union(1, 2);
        union(3, 4);

        System.out.println(find(2)); // same set as 0
        System.out.println(find(4)); // different set
    }
}