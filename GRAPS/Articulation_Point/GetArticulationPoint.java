/*
=====================================================================================
📘 PROGRAM NAME  : Articulation Point Detection in a Graph (Tarjan’s Algorithm)
📂 PACKAGE       : GRAPS.Articulation_Point
💡 TOPIC         : Graph Theory | DFS | Tarjan’s Algorithm | Articulation Points
📅 DESCRIPTION   :
   This program identifies all **Articulation Points (Cut Vertices)** in an 
   **Undirected Graph** using **Tarjan’s Algorithm**.

   An articulation point is a vertex whose removal **increases the number of 
   connected components** in the graph — meaning it disconnects part of the graph.

=====================================================================================
🎯 OBJECTIVE:
Detect and print all the **Articulation Points (APs)** in an undirected graph 
using a single DFS traversal.

Example Graph:
         (0)
        / | \
      (1)-(2)
        |
       (3)
        |
       (4)

✅ Articulation Point Found:
    3

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the graph using an **Adjacency List** representation.

3️⃣ Use **DFS traversal** to compute:
    - `dt[]`  → Discovery Time (when a node is first visited)
    - `low[]` → Lowest reachable discovery time through the subtree

4️⃣ Articulation Point Detection Conditions:
    🔹 **Root Node Case:** 
        If the root of DFS has **2 or more children**, it is an AP.
    🔹 **Non-Root Case:** 
        If `dt[curr] <= low[neighbor]`, then `curr` is an AP.

5️⃣ Continue DFS for all connected components.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is visited once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack, visited, discovery, and low arrays.

=====================================================================================
*/

package GRAPS.Articulation_Point;

import java.util.ArrayList;

public class GetArticulationPoint {

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

        graph[4].add(new Edge(4, 3));
    }

    // 🔹 DFS function for Articulation Point Detection using Tarjan’s Algorithm
    public static void dfs(ArrayList<Edge>[] graph, int curr, int[] dt, int[] low, int[] time,
            boolean[] visit, boolean[] ap, int parent) {

        visit[curr] = true;
        dt[curr] = low[curr] = ++time[0];
        int children = 0; // Count of child vertices

        for (Edge e : graph[curr]) {
            if (e.dest == parent)
                continue; // Skip the edge to parent

            if (visit[e.dest]) {
                // Back Edge → update low value
                low[curr] = Math.min(low[curr], dt[e.dest]);
            } else {
                // Tree Edge → recursive DFS call
                dfs(graph, e.dest, dt, low, time, visit, ap, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);

                // Non-root case: check for AP condition
                if (dt[curr] <= low[e.dest] && parent != -1) {
                    ap[curr] = true;
                }
                children++;
            }
        }

        // Root case: if root has 2 or more children
        if (parent == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    // 🔹 Wrapper function to initiate DFS on all graph components
    public static void getAP(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];
        int[] low = new int[V];
        int[] time = { 0 };
        boolean[] visit = new boolean[V];
        boolean[] ap = new boolean[V];

        // Run DFS for all components
        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                dfs(graph, i, dt, low, time, visit, ap, -1);
            }
        }

        // Print all Articulation Points
        System.out.println("🔍 Articulation Points in the Graph:");
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("🔹 Node " + i + " is an Articulation Point");
            }
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        getAP(graph, V);
    }
}