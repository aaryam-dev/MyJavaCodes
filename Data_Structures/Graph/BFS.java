import java.util.*;

public class GraphBFS {

    public static void addEdge(List<Integer>[] adj, int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void BFS(List<Integer>[] adj, int V, int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<Integer>[] adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);

        BFS(adj, V, 0);
    }
}
