/*
=====================================================================================
📘 PROGRAM NAME  : Prim’s Algorithm - Minimum Spanning Tree (MST)
📂 PACKAGE       : GRAPS.Minimum_Spanning_Tree.PrimsAlgorithm
💡 TOPIC         : Graphs | MST | Greedy Algorithm | Priority Queue
📅 DESCRIPTION   :
   This program implements **Prim’s Algorithm** to find the **Minimum Spanning Tree (MST)**
   of a connected, weighted, undirected graph.

   The MST connects all vertices with the minimum total edge weight and 
   **no cycles**.

=====================================================================================
🎯 OBJECTIVE:
Find the **minimum cost** required to connect all vertices in the graph 
using Prim’s Algorithm.

Example Graph:
          (0)
         / | \
       10 15 30
       /   |   \
     (1)--40---(3)
       \       /
        \50   /
         (2)

✅ Minimum Spanning Tree Cost = 65

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex  
    - `dest` → Destination vertex  
    - `wt`   → Weight of the edge  

2️⃣ Build the graph using an **Adjacency List**.

3️⃣ Use a **Priority Queue (Min-Heap)** to always pick the edge 
    with the smallest weight.

4️⃣ Maintain a **visited[]** array to avoid cycles.

5️⃣ Add edges connecting new vertices until all vertices are included.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(E log V) — Each edge insertion/removal in priority queue.  

📊 SPACE COMPLEXITY:
   🔹 O(V + E) — For adjacency list, visited array, and PQ.

=====================================================================================
*/

package GRAPS.Minimum_Spanning_Tree.PrimsAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    // 🔹 Edge class to represent graph edges
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

    // 🔹 Function to build the undirected weighted graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    // 🔹 Helper Pair class for priority queue
    static class Pair implements Comparable<Pair> {
        int node;
        int cost;

        public Pair(int n, int c) {
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    // 🔹 Prim’s Algorithm Implementation
    public static void primsAlgorithm(ArrayList<Edge>[] graph, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[V];

        pq.add(new Pair(0, 0));
        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.node]) {
                visited[curr.node] = true;
                mstCost += curr.cost;

                for (Edge e : graph[curr.node]) {
                    if (!visited[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("✅ Minimum Cost of MST = " + mstCost);
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        primsAlgorithm(graph, V);
    }
}