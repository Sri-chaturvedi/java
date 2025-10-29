/*
=====================================================================================
📘 PROGRAM NAME  : Topological Sorting of a Directed Acyclic Graph (DAG)
📂 PACKAGE       : GRAPS.Topological_Sorting
💡 TOPIC         : Graph Traversal | DFS | Topological Sort | DAG
📅 DESCRIPTION   :
   This program performs **Topological Sorting** on a **Directed Acyclic Graph (DAG)** 
   using **Depth-First Search (DFS)**.

   Topological Sorting is a **linear ordering of vertices** such that for every 
   directed edge (u → v), vertex `u` comes **before** vertex `v` in the ordering.

=====================================================================================
🎯 OBJECTIVE:
Generate a valid **topological order** of vertices in a **DAG** using DFS.

Example Graph:
     (5) → (0) ← (4)
      ↓           ↑
     (2) → (3) → (1)

Possible Topological Order:
   ➤ 5, 4, 2, 3, 1, 0

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the graph using an **Adjacency List**.

3️⃣ Perform DFS traversal:
    - Recursively visit all unvisited neighbors.
    - After exploring all neighbors of a node, **push the node into a stack**.
    - This ensures that dependencies (child nodes) are added first.

4️⃣ After DFS completes for all nodes:
    - Pop all elements from the stack to get the **Topological Order**.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is visited once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For visited array and recursion stack.

=====================================================================================
*/

package GRAPS.Topological_Sorting;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    // 🔹 Edge class representing a directed connection between two vertices
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

        // Directed Edges
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // 🔹 Recursive utility for DFS-based topological sort
    public static void topoSortUtil(ArrayList<Edge>[] graph, boolean[] visited,
            int curr, Stack<Integer> stack) {
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                topoSortUtil(graph, visited, e.dest, stack);
            }
        }

        // Push current vertex after visiting all its neighbors
        stack.push(curr);
    }

    // 🔹 Main Topological Sort function
    public static void topoSort(ArrayList<Edge>[] graph, int V) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Perform DFS for all unvisited nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoSortUtil(graph, visited, i, stack);
            }
        }

        // Print Topological Order (Stack reversed)
        System.out.println("Topological Sort Order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topoSort(graph, V);
    }
}
