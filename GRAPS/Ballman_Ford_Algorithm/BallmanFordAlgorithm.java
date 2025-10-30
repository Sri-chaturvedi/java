/*
=====================================================================================
📘 PROGRAM NAME  : Bellman-Ford Algorithm (Shortest Path in Weighted Graph)
📂 PACKAGE       : GRAPS.Ballman_Ford_Algorithm
💡 TOPIC         : Graph | Dynamic Programming | Shortest Path | Negative Weights
📅 DESCRIPTION   :
   This program implements the **Bellman-Ford Algorithm** to find the shortest 
   distances from a **source vertex** to all other vertices in a **weighted directed 
   graph**, even if some edges have **negative weights**.

   Unlike Dijkstra’s Algorithm, Bellman-Ford can handle **negative edge weights** 
   and is also capable of detecting **negative weight cycles**.

=====================================================================================
🎯 OBJECTIVE:
Find the **shortest path distances** from a given **source vertex** to all other 
vertices in a weighted graph, handling **negative edges** safely.

Example Graph:
       (0)
      /   \
    2/     \4
    /       \
   (1)←-1—(4)
     \-4     ^
      \       |
       v       |
       (2)—2—>(3)

✅ Shortest Distance Output from Source (0):
   ➤ [0, 1, -2, 0, 4]

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex
    - `wt`   → Edge weight (can be negative)

2️⃣ Build the graph using an **Adjacency List**.

3️⃣ Initialize:
    - `dist[]` → Distance from source to all vertices (∞ for all except source).

4️⃣ Relax All Edges (V - 1) times:
    - For each edge `(u, v)`:
        🔹 If `dist[u] + wt < dist[v]`, update `dist[v] = dist[u] + wt`.

5️⃣ (Optional) Check for **Negative Weight Cycle**:
    - Run one more iteration.
    - If any distance is still updated, a **negative cycle exists**.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V * E) — For each vertex, all edges are relaxed once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For distance array.

=====================================================================================
*/

package GRAPS.Ballman_Ford_Algorithm;

import java.util.ArrayList;

public class BallmanFordAlgorithm {

    // 🔹 Represents a weighted directed edge between two vertices
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // 🔹 Creates a weighted directed graph (may include negative edges)
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges with positive and negative weights
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    // 🔹 Bellman-Ford Algorithm implementation
    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V];

        // Step 1️⃣ Initialize distances
        for (int i = 0; i < V; i++) {
            dist[i] = (i == src) ? 0 : Integer.MAX_VALUE;
        }

        // Step 2️⃣ Relax edges (V - 1) times
        for (int k = 0; k < V - 1; k++) {
            for (int i = 0; i < V; i++) {
                for (Edge e : graph[i]) {
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        // Step 3️⃣ (Optional) Detect negative weight cycle
        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                int u = e.src;
                int v = e.dest;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                    System.out.println("⚠️ Negative weight cycle detected!");
                    return;
                }
            }
        }

        // Step 4️⃣ Print shortest distances
        System.out.println("Shortest distances from source (" + src + "):");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " → Distance: " + dist[i]);
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0, V);
    }
}
