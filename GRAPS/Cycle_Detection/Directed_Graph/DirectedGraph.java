/*
=====================================================================================
📘 PROGRAM NAME  : Cycle Detection in a Directed Graph (Using DFS)
📂 PACKAGE       : GRAPS.Cycle_Detection
💡 TOPIC         : Graph Traversal | DFS | Recursion | Cycle Detection
📅 DESCRIPTION   :
   This program detects whether a **cycle exists** in a **directed graph**
   using **Depth-First Search (DFS)** and a **recursion stack** approach.

   The algorithm marks each vertex during DFS traversal and uses a separate
   recursion stack (`recStack[]`) to keep track of nodes currently in the
   recursion path. If any vertex is visited again while still in the recursion
   stack, a cycle is detected.

=====================================================================================
🎯 OBJECTIVE:
Detect and report whether a **directed graph** contains a **cycle**.

Example Graph:
        (0) → (2) → (3)
         ↑           |
         └───────────┘

   Output: Cycle detected → true

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the graph using an **Adjacency List** representation.

3️⃣ Perform DFS traversal:
    - Mark current node as visited
    - Add it to the recursion stack
    - Recur for all its neighbors:
         🔹 If neighbor is already in recursion stack → Cycle found
         🔹 Else, continue DFS
    - Remove node from recursion stack after exploring all neighbors

4️⃣ If any DFS call returns true, the graph contains a cycle.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is processed once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack and visited array.

=====================================================================================
*/

package GRAPS.Cycle_Detection.Directed_Graph;

import java.util.ArrayList;

public class DirectedGraph {

    // 🔹 Edge class representing a directed edge between two vertices
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Create the graph using adjacency lists
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    // 🔹 DFS-based function to detect a cycle in a directed graph
    public static boolean isCycleDirected(ArrayList<Edge>[] graph, int curr,
            boolean[] visited, boolean[] recStack) {
        visited[curr] = true;
        recStack[curr] = true;

        for (Edge e : graph[curr]) {
            if (recStack[e.dest]) {
                return true; // Cycle detected
            } else if (!visited[e.dest]) {
                if (isCycleDirected(graph, e.dest, visited, recStack)) {
                    return true;
                }
            }
        }

        recStack[curr] = false; // Remove from recursion stack before returning
        return false;
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        boolean cycleFound = false;

        // Check each unvisited vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleDirected(graph, i, visited, recStack)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        System.out.println("Cycle detected: " + cycleFound);
    }
}
