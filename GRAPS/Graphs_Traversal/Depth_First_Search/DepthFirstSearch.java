/*
=====================================================================================
📘 PROGRAM NAME  : Depth-First Search (DFS) Traversal of a Graph
📂 PACKAGE       : GRAPS.Graphs_Traversal.Depth_First_Search
💡 TOPIC         : Graph Traversal | DFS | Adjacency List | Recursion | Undirected Graph
📅 DESCRIPTION   :
   This program demonstrates how to perform a **Depth-First Search (DFS)**
   traversal on an **Undirected Unweighted Graph** using an **Adjacency List**
   representation in Java.

   DFS explores a graph by going **as deep as possible** along each branch
   before backtracking. It is typically implemented using **recursion** or a **stack**.

=====================================================================================
🎯 OBJECTIVE:
Implement the **DFS algorithm** to traverse all nodes in a graph
and handle disconnected components efficiently.

Example Graph Structure:
          (0)
         /   \
       (1)   (2)
        |     |
       (3)   (4)
        \   /
         (5)
          |
         (6)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Create a graph using an **ArrayList<Edge>[]** as an adjacency list.

3️⃣ Perform DFS:
    - Visit the current node and mark it as visited
    - Recursively visit all unvisited neighbors

4️⃣ Handle **disconnected graphs** by running DFS for every unvisited vertex.

=====================================================================================
🔹 Example Walkthrough:

   Vertices: 0 to 6

   Edges:
      0 — 1, 0 — 2
      1 — 3
      2 — 4
      3 — 4, 3 — 5
      4 — 5
      5 — 6

   DFS Traversal Output:
      0 1 3 4 2 5 6
      (Order may vary based on edge order)

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is processed once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack and visited array.

=====================================================================================
*/

package GRAPS.Graphs_Traversal.Depth_First_Search;

import java.util.*;

public class DepthFirstSearch {

    // 🔹 Edge class representing a connection between two vertices
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Method to create the graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (undirected)
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // 🔹 Perform DFS traversal recursively
    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited, int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfs(graph, visited, e.dest);
            }
        }
    }

    // 🔹 Main method to execute the program
    public static void main(String[] args) {
        int V = 7; // Number of vertices

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];

        System.out.println("DFS Traversal of the Graph:");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
            }
        }

        System.out.println();
    }
}
