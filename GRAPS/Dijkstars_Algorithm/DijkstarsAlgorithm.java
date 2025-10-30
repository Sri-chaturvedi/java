/*
=====================================================================================
📘 PROGRAM NAME  : Dijkstra's Algorithm (Shortest Path in Weighted Graph)
📂 PACKAGE       : GRAPS.Dijkstars_Algorithm
💡 TOPIC         : Graph | Greedy Algorithm | Priority Queue | Shortest Path
📅 DESCRIPTION   :
   This program implements **Dijkstra’s Algorithm** to find the **shortest distance**
   from a **source vertex** to all other vertices in a **weighted graph**.

   Dijkstra’s algorithm uses a **greedy approach** with a **Priority Queue (Min-Heap)**
   to always explore the node with the smallest known distance first.

=====================================================================================
🎯 OBJECTIVE:
Find the **shortest path distances** from a given **source vertex** to all other
vertices in a weighted directed graph using Dijkstra’s Algorithm.

Example Graph:
       (0)
      /   \
    2/     \4
    /       \
   (1)——1——>(2)
     \7       \
      \         \3
       \         \
        (3)<—2—(4)
          \
           \1
            \
            (5)

✅ Shortest Distance Output from Source (0):
   ➤ [0, 2, 3, 8, 6, 9]

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex
    - `wt`   → Edge weight

2️⃣ Build the graph using an **Adjacency List** representation.

3️⃣ Initialize:
    - `dist[]` → Stores minimum distance from source to each vertex
    - `visit[]` → Marks whether a vertex is finalized
    - `PriorityQueue<Pair>` → Selects next vertex with smallest distance

4️⃣ Algorithm Steps:
    - Start from the source vertex.
    - For each unvisited neighbor:
        🔹 If `dist[u] + weight < dist[v]`, update `dist[v]`.
        🔹 Push `(v, dist[v])` into priority queue.
    - Repeat until all vertices are processed.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O((V + E) * log V) — Each edge and vertex processed using a heap.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For distance array, visited array, and priority queue.

=====================================================================================
*/

package GRAPS.Dijkstars_Algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstarsAlgorithm {

    // 🔹 Represents a weighted edge between two vertices
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

    // 🔹 Creates a sample weighted directed graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges with weights
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    // 🔹 Helper Pair class to store node and its current distance
    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;

        public Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist; // For min-heap
        }
    }

    // 🔹 Dijkstra's Algorithm Implementation
    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visit = new boolean[V];
        int[] dist = new int[V];

        // Initialize all distances to infinity except source
        for (int i = 0; i < V; i++) {
            dist[i] = (i == src) ? 0 : Integer.MAX_VALUE;
        }

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visit[curr.node]) {
                visit[curr.node] = true;

                for (Edge e : graph[curr.node]) {
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // 🔹 Print the shortest distances from the source
        System.out.println("Shortest distances from source (" + src + "):");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " → Distance: " + dist[i]);
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0, V);
    }
}
