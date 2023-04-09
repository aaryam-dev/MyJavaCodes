import java.util.ArrayList;

public class Graph {
    public static void addEdge(ArrayList<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
    }
}
