/*
=====================================================================================
📘 PROGRAM NAME  : All Paths from Source to Target in a Graph
📂 PACKAGE       : GRAPS.All_Paths_From_Source_To_Target
💡 TOPIC         : Graph Traversal | Recursion | Backtracking | DFS
📅 DESCRIPTION   :
   This program finds **all possible paths** from a **source vertex** to a
   **target vertex** in a graph using **Depth-First Search (DFS)** with **backtracking**.

   The graph is represented using an **Adjacency List**, and recursive traversal
   explores all possible paths without revisiting nodes in the current path.

=====================================================================================
🎯 OBJECTIVE:
Find and print **all distinct paths** between a given source and target vertex
in an undirected, unweighted graph.

Example Graph:
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

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the **graph** using an adjacency list representation.

3️⃣ Use recursive DFS to:
    - Add current node to path
    - If current node == target → print path
    - Else, recursively explore unvisited neighbors
    - Backtrack by marking current node unvisited

4️⃣ The recursion explores every possible route between source and target.

=====================================================================================
🔹 Example Walkthrough:

   Source = 0, Target = 5

   Possible Paths:
      0 → 1 → 3 → 5
      0 → 1 → 3 → 4 → 5
      0 → 2 → 4 → 5
      0 → 2 → 4 → 3 → 5

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V^V) — In the worst case (dense graph), each vertex connects to all others.
   🔹 Practically behaves like exponential complexity due to path enumeration.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack and visited array.

=====================================================================================
*/

package GRAPS.All_Paths_From_Source_To_Target;

import java.util.ArrayList;

public class AllPathsFromSourceToTarget {

    // 🔹 Edge class representing a connection between two vertices
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

    // 🔹 Recursive DFS function to print all paths from src → target
    public static void printAllPaths(ArrayList<Edge>[] graph, boolean[] visited,
            int curr, String path, int target) {

        if (curr == target) {
            System.out.println(path);
            return;
        }

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                visited[curr] = true; // Mark current node
                printAllPaths(graph, visited, e.dest, path + " → " + e.dest, target);
                visited[curr] = false; // Backtrack
            }
        }
    }

    // 🔹 Main method to execute the program
    public static void main(String[] args) {
        int V = 7; // Number of vertices

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0, target = 5;

        System.out.println("All possible paths from " + src + " to " + target + ":");
        printAllPaths(graph, new boolean[V], src, "" + src, target);
    }
}
