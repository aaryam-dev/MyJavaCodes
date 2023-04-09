import java.util.ArrayList;

public class Main {
    // detect cycle in undirected graph using DFS
    // 1. Visited
    // 2. Adjacent
    // 3. Not a parent
    public static boolean DFSRec(ArrayList<Integer>[] adj, int s, boolean[] visited, int parent) {
        visited[s] = true;

        for (int u : adj[s]) {
            if (visited[u] == false) {
                if (DFSRec(adj, u, visited, s) == true) {
                    return true;
                }
            } else if (u != parent) {
                return true;
            }
        }
        return false;
    }

    public static boolean DFS(ArrayList<Integer>[] adj, int V) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        for (int i = 0; i < V; i++) {
            if (visited[i] == false)
                if (DFSRec(adj, i, visited, -1) == true)
                    return true;
        }
        return false;
    }

    public static void addEdge(ArrayList<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);

        if (DFS(adj, V))
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }
}
