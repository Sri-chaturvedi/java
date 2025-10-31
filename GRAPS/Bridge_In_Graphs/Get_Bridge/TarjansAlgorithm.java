/*
=====================================================================================
📘 PROGRAM NAME  : Bridge Detection in a Graph (Tarjan’s Algorithm)
📂 PACKAGE       : GRAPS.Bridge_In_Graphs.Get_Bridge
💡 TOPIC         : Graph Theory | DFS | Tarjan’s Algorithm | Bridge Detection
📅 DESCRIPTION   :
   This program identifies all **Bridges (Critical Connections)** in an **Undirected Graph** 
   using **Tarjan’s Algorithm**.

   A bridge is an edge whose removal **increases the number of connected components** 
   in the graph — meaning it disconnects part of the graph.

=====================================================================================
🎯 OBJECTIVE:
Detect and print all the **bridge edges** in an undirected graph using DFS traversal.

Example Graph:
         (0)
        / | \
      (1)-(2)
        |
       (3)
      /   \
    (4) - (5)

✅ Bridge Found:
    0 — 3

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the graph using an **Adjacency List** representation.

3️⃣ Use **DFS traversal** to compute:
    - `dt[]`  → Discovery Time (when a node is first visited)
    - `low[]` → Lowest reachable discovery time through the subtree

4️⃣ Bridge Detection Condition:
    - If `dt[curr] < low[neighbor]`, 
      then edge `(curr — neighbor)` is a **bridge**.

5️⃣ Continue DFS for all connected components.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is visited once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack, visited, discovery, and low arrays.

=====================================================================================
*/

package GRAPS.Bridge_In_Graphs.Get_Bridge;

import java.util.ArrayList;

public class TarjansAlgorithm {

    // 🔹 Edge class to represent an undirected connection between nodes
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Create the graph using adjacency list representation
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected Graph Edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    // 🔹 DFS function for Bridge Detection using Tarjan’s Algorithm
    public static void dfs(ArrayList<Edge>[] graph, int curr, int[] dt, int[] low,
            boolean[] visit, int time, int parent) {

        visit[curr] = true;
        dt[curr] = low[curr] = ++time; // Initialize discovery and low time

        for (Edge e : graph[curr]) {
            if (e.dest == parent) {
                continue; // Skip the edge leading back to parent
            }

            if (!visit[e.dest]) {
                dfs(graph, e.dest, dt, low, visit, time, curr);

                // Update the low value after recursion
                low[curr] = Math.min(low[curr], low[e.dest]);

                // Bridge condition
                if (dt[curr] < low[e.dest]) {
                    System.out.println("🔹 Bridge found between nodes: " + curr + " — " + e.dest);
                }
            } else {
                // Back edge detected → update low
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    // 🔹 Wrapper function to initiate DFS on all graph components
    public static void getBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] visit = new boolean[V];
        int time = 0;

        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                dfs(graph, i, dt, low, visit, time, -1);
            }
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("🔍 Bridges in the Graph:");
        getBridge(graph, V);
    }
}