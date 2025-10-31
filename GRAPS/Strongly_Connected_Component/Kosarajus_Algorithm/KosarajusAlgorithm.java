/*
=====================================================================================
📘 PROGRAM NAME  : Kosaraju’s Algorithm - Strongly Connected Components (SCC)
📂 PACKAGE       : GRAPS.Strongly_Connected_Component.Kosarajus_Algorithm
💡 TOPIC         : Graph Traversal | DFS | Strongly Connected Components | Kosaraju
📅 DESCRIPTION   :
   This program finds all **Strongly Connected Components (SCCs)** in a directed graph
   using **Kosaraju’s Algorithm**. 

   The algorithm works in 3 main steps:
     1. Perform DFS and store vertices in a stack according to their finishing times.
     2. Transpose the graph (reverse all edges).
     3. Perform DFS on the transposed graph in the order of the stack to find SCCs.

=====================================================================================
🎯 OBJECTIVE:
Identify all **strongly connected components** in a directed graph.

Example Graph:
    (0) → (2) → (1) → (0)
    (0) → (3) → (4)

✅ SCCs:
    {0, 1, 2}
    {3}
    {4}

=====================================================================================
⚙️ LOGIC / FLOW:

1️⃣ Define an `Edge` class with:
    - `src`  → Source vertex
    - `dest` → Destination vertex

2️⃣ Build the directed graph using **Adjacency List**.

3️⃣ Topological Sorting:
    - Perform DFS to order vertices by finishing time.
    - Push finished vertices onto a stack.

4️⃣ Transpose Graph:
    - Reverse all edges.

5️⃣ DFS on Transposed Graph:
    - Pop vertices from the stack.
    - DFS to collect strongly connected components.

=====================================================================================
📊 TIME COMPLEXITY:
   🔹 O(V + E) — Each vertex and edge is visited twice.

📊 SPACE COMPLEXITY:
   🔹 O(V + E) — For adjacency list, stack, visited array, and transpose graph.

=====================================================================================
*/

package GRAPS.Strongly_Connected_Component.Kosarajus_Algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajusAlgorithm {

    // 🔹 Edge class representing a directed edge
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

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    // 🔹 DFS for topological sorting (used to fill stack by finishing time)
    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visit, Stack<Integer> s) {
        visit[curr] = true;

        for (Edge e : graph[curr]) {
            if (!visit[e.dest]) {
                topSort(graph, e.dest, visit, s);
            }
        }

        s.push(curr);
    }

    // 🔹 Standard DFS to explore components
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visit) {
        visit[curr] = true;
        System.out.print(curr + " ");

        for (Edge e : graph[curr]) {
            if (!visit[e.dest]) {
                dfs(graph, e.dest, visit);
            }
        }
    }

    // 🔹 Kosaraju’s Algorithm to find all SCCs
    public static void kosarajuAlgo(ArrayList<Edge>[] graph, int V) {
        Stack<Integer> s = new Stack<>();
        boolean[] visit = new boolean[V];

        // Step 1: Topological sort
        for (int i = 0; i < V; i++) {
            if (!visit[i]) {
                topSort(graph, i, visit, s);
            }
        }

        // Step 2: Transpose graph
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transpose[i] = new ArrayList<>();
            visit[i] = false; // reset visited for second DFS
        }

        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: DFS on transposed graph to find SCCs
        System.out.println("Strongly Connected Components (SCCs):");
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visit[curr]) {
                dfs(transpose, curr, visit);
                System.out.println();
            }
        }
    }

    // 🔹 Main method
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        kosarajuAlgo(graph, V);
    }
}