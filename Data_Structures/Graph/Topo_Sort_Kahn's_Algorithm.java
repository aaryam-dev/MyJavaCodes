import java.util.*;

public class TopologicalSort {
    static void topologicalSort(List<Integer>[] adj, int V) {
        int[] inDegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : adj[u]) {
                inDegree[v]++;
            }
        }
  
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
  
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
  
            for (int v : adj[u]) {
                if (--inDegree[v] == 0) {
                    q.add(v);
                }
            }
        }
    }

    static void addEdge(List<Integer>[] adj, int u, int v) {
        adj[u].add(v);
    }

    public static void main(String[] args) {
        int V = 5;
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        addEdge(adj, 0, 2); 
        addEdge(adj, 0, 3); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3);  

        System.out.print("Following is a Topological Sort of\n"); 
        topologicalSort(adj, V);
    }
}
