import java.util.*;

public class Main {
    public static void addEdge(ArrayList<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void BFS(ArrayList<Integer>[] adj, int V, int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void BFSdis(ArrayList<Integer>[] adj, int V) {
        boolean[] visited = new boolean[V + 1];
        Arrays.fill(visited, false);
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFS(adj, V, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

        BFSdis(adj, V);
    }
}
