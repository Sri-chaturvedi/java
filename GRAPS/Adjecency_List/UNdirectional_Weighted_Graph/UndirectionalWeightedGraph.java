/*
=====================================================================================
📘 PROGRAM NAME  : Undirected Weighted Graph using Adjacency List
📂 PACKAGE       : GRAPS.Adjecency_List.UNdirectional_Weighted_Graph
💡 TOPIC         : Graph Representation | Adjacency List | Weighted Graph
📅 DESCRIPTION   :
   This program demonstrates how to represent an **Undirected Weighted Graph**
   using an **Adjacency List** in Java.

   In an *undirected graph*, every edge connects two vertices in both directions.
   Since it’s *weighted*, each edge also stores a cost or distance value.

=====================================================================================
🎯 OBJECTIVE:
Implement an **Undirected Weighted Graph** using adjacency lists and 
print all edges connected to a particular vertex.

Example Graph:
          (0)
          / \
       2 /   \ 10
        /     \
      (2)----- (1)
       |  -1   /
       |       /
       |  0   /
       (3)———

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex
    - `wt`   → Weight of the edge

2️⃣ Use an **ArrayList<Edge>[]** to represent the adjacency list for each vertex.

3️⃣ For each edge (u, v, w):
    - Add (u → v, w)
    - Add (v → u, w) → since undirected

4️⃣ Print the neighbors and edge weights for a selected vertex.

=====================================================================================
🔹 Example Walkthrough:

   Vertices: 0, 1, 2, 3

   Edges:
      0 — 2 (2)
      1 — 2 (10)
      1 — 3 (0)
      2 — 3 (-1)

   Neighbors of vertex 2:
      (0, 2), (3, -1), (1, 10)

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 Graph Construction : O(V + E)
   🔹 Traversal / Print  : O(E)

📊 SPACE COMPLEXITY:
   O(V + E) — Adjacency list representation

=====================================================================================
*/

package GRAPS.Adjecency_List.UNdirectional_Weighted_Graph;

import java.util.ArrayList;

public class UndirectionalWeightedGraph {

    // 🔹 Edge class representing a weighted connection between two vertices
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

    // 🔹 Create graph using adjacency list representation
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (undirected)
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[2].add(new Edge(2, 1, 10));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    // 🔹 Main method to execute the program
    public static void main(String[] args) {
        int V = 4; // Number of vertices

        // Initialize adjacency list
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // 🔹 Print all neighbors and weights for vertex 2
        System.out.println("Neighbors of vertex 2 (Destination, Weight):");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("→ Destination = " + e.dest + " , Weight = " + e.wt);
        }
    }
}
