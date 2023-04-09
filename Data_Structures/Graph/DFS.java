import java.util.ArrayList;

public class Main {
    public static void addEdge(ArrayList<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void DFSrec(ArrayList<Integer>[] adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for (int u : adj[s]) {
            if (!visited[u]) {
                DFSrec(adj, u, visited);
            }
        }
    }

    public static void DFS(ArrayList<Integer>[] adj, int V, int s) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        DFSrec(adj, s, visited);
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

        DFS(adj, V, 0);
    }
}
