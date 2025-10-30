/*
=====================================================================================
📘 PROGRAM NAME  : Cycle Detection in an Undirected Graph (DFS)
📂 PACKAGE       : GRAPS.Cycle_Detection.UnDirected_Graph
💡 TOPIC         : Graph Traversal | DFS | Cycle Detection | Undirected Graph
📅 DESCRIPTION   :
   This program detects whether a **cycle exists** in an **Undirected Graph**
   using **Depth-First Search (DFS)**.

   In an undirected graph, a cycle exists if during traversal we encounter 
   an already visited vertex that is **not the parent** of the current node.

=====================================================================================
🎯 OBJECTIVE:
Detect the presence of a **cycle** in an **undirected graph** using DFS traversal.

Example Graph:
        (0) —— (1)
         |     / \
         |    /   \
         |   /     \
        (4) —— (2)
         |
        (5)

✅ Cycle Present: (0 → 1 → 4 → 0)

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the graph using an **Adjacency List**.

3️⃣ DFS-based Cycle Detection:
    - Mark the current node as visited.
    - For every neighbor:
        🔹 If the neighbor is unvisited → recursively visit it.
        🔹 If the neighbor is visited and **not the parent**, a cycle exists.

4️⃣ Return `true` if a cycle is found; otherwise, `false`.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is visited once.

📊 SPACE COMPLEXITY:
   🔹 O(V) — For recursion stack and visited array.

=====================================================================================
*/

package GRAPS.Cycle_Detection.UnDirected_Graph;

import java.util.ArrayList;

public class UnDirectedGraph {

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
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    // 🔹 DFS-based function to detect cycle in an undirected graph
    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] visited,
            int curr, int parent) {
        visited[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                if (isCycleUndirected(graph, visited, e.dest, curr)) {
                    return true;
                }
            } else if (e.dest != parent) {
                // Already visited and not parent ⇒ Cycle found
                return true;
            }
        }
        return false;
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] visited = new boolean[V];
        boolean cycleFound = false;

        // Check for cycle in all components (for disconnected graphs)
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleUndirected(graph, visited, i, -1)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        System.out.println("Cycle Present in Graph: " + cycleFound);
    }
}
