/*
=====================================================================================
📘 PROGRAM NAME  : Undirected Unweighted Graph using Adjacency List
📂 PACKAGE       : GRAPS.Adjecency_List.Undirectional_UnWeighted_Graph
💡 TOPIC         : Graph Representation | Adjacency List | Undirected Graph
📅 DESCRIPTION   :
   This program demonstrates how to represent an **Undirected Unweighted Graph**
   using an **Adjacency List** in Java.

   A graph is a collection of vertices (nodes) and edges (connections).
   In an *undirected* graph, edges have no direction (i.e., if A → B, then B → A).
   Since the graph is *unweighted*, edges don’t carry any weight or cost value.

=====================================================================================
🎯 OBJECTIVE:
Represent and print an **Undirected, Unweighted Graph** using an adjacency list.

Example Graph:
       (0)
        |
        |
       (1)
      /   \
    (2)---(3)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Create an `Edge` class with:
      - `src`  → Source vertex
      - `dest` → Destination vertex

2️⃣ Use an **ArrayList<Edge>[]** to represent the adjacency list for each vertex.

3️⃣ For an undirected graph:
      - Add edge (u → v)
      - Also add edge (v → u)

4️⃣ Finally, print the adjacency list for a chosen vertex to display its neighbors.

=====================================================================================
🔹 Example Walkthrough:
   Vertices: 0, 1, 2, 3

   Edges:
      0 — 1
      1 — 2
      1 — 3
      2 — 3
      2 — 0
      3 — 1
      3 — 2

   Neighbors of vertex 2 → [1, 3, 0]

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Building Graph : O(V + E)
   🔹 Printing Edges : O(E)

📊 SPACE COMPLEXITY:
   O(V + E) — Adjacency list storage

=====================================================================================
*/

package GRAPS.Adjecency_List.Undirectional_UnWeighted_Graph;

import java.util.ArrayList;

public class UnDirectionalUnWeightedGraph {

    // 🔹 Inner class to represent an edge between two vertices
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // 🔹 Create the graph using adjacency list representation
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Adding edges (undirected)
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    // 🔹 Main method to execute the program
    public static void main(String args[]) {
        int V = 4; // number of vertices

        // Initialize adjacency list
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // 🔹 Print neighbors of vertex 2
        System.out.print("Neighbors of vertex 2 → ");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();
    }
}
