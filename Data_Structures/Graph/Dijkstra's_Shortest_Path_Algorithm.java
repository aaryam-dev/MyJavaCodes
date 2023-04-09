import java.util.*;

public class Main {
    static final int V = 4;

    public static List<Integer> djikstra(int[][] graph, int src) {
        List<Integer> dist = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            dist.add(Integer.MAX_VALUE);
        }
        dist.set(src, 0);
        boolean[] fin = new boolean[V];

        for (int count = 0; count < V - 1; count++) {
            int u = -1;

            for (int i = 0; i < V; i++) {
                if (!fin[i] && (u == -1 || dist.get(i) < dist.get(u))) {
                    u = i;
                }
            }
            fin[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !fin[v]) {
                    dist.set(v, Math.min(dist.get(v), dist.get(u) + graph[u][v]));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 50, 100, 0}, // weights given
            {50, 0, 30, 200},
            {100, 30, 0, 20},
            {0, 200, 20, 0},
        };

        for (int x : djikstra(graph, 0)) {
            System.out.print(x + " ");
        }
    }
}
