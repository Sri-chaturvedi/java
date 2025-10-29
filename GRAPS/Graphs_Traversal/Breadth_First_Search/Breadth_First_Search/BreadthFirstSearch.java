/*
=====================================================================================
📘 PROGRAM NAME  : Breadth-First Search (BFS) Traversal of a Graph
📂 PACKAGE       : GRAPS.Graphs_Traversal.Breadth_First_Search
💡 TOPIC         : Graph Traversal | BFS | Adjacency List | Queue | Undirected Graph
📅 DESCRIPTION   :
   This program demonstrates how to perform a **Breadth-First Search (BFS)**
   traversal on an **Undirected Unweighted Graph** using an **Adjacency List**
   representation in Java.

   BFS explores all neighbors of a vertex before moving to the next level,
   ensuring the shortest path (in unweighted graphs) from the source node.

=====================================================================================
🎯 OBJECTIVE:
Implement the **BFS algorithm** to traverse a graph level-by-level and
visit all connected components.

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

3️⃣ Use a **Queue** to perform BFS:
    - Start from a source node
    - Visit all neighbors level by level
    - Mark nodes as visited to avoid repetition

4️⃣ Handle **disconnected graphs** by running BFS for each unvisited node.

=====================================================================================
🔹 Example Walkthrough:

   Vertices: 0 to 6

   Edges:
      0 — 1, 0 — 2
      1 — 3
      2 — 4
      3 — 5
      4 — 5
      5 — 6

   BFS Traversal Output:
      0 1 2 3 4 5 6

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is processed once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For the visited array and queue.

=====================================================================================
*/

package GRAPS.Graphs_Traversal.Breadth_First_Search.Breadth_First_Search;

import java.util.*;

public class BreadthFirstSearch {

    // 🔹 Edge class representing a connection between two vertices
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Method to create a sample graph
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
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // 🔹 Perform BFS traversal from a given starting vertex
    public static void bfs(ArrayList<Edge>[] graph, int V, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.remove();

            if (!visited[current]) {
                System.out.print(current + " ");
                visited[current] = true;

                for (Edge e : graph[current]) {
                    queue.add(e.dest);
                }
            }
        }
    }

    // 🔹 Main method to execute the program
    public static void main(String[] args) {
        int V = 7; // Number of vertices

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];

        System.out.println("BFS Traversal of the Graph:");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfs(graph, V, visited, i);
            }
        }

        System.out.println();
    }
}
