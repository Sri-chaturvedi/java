package GRAPS.Graphs_Traversal.Breadth_First_Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // Edge class represents a connection between two vertices
    static class Edge {
        int src;   // source vertex
        int dest;  // destination vertex

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    /**
     * Function to create a sample graph (Adjacency List representation)
     */
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Graph structure
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

    /**
     * Breadth-First Search (BFS) Traversal
     *
     * @param graph - adjacency list of the graph
     * @param vis   - visited array
     * @param start - starting vertex
     */
    public static void bfs(ArrayList<Edge>[] graph, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start); // enqueue starting node

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                // Mark current node visited and print it
                System.out.print(curr + " ");
                vis[curr] = true;

                // Add all neighbors to the queue
                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        /*
              Graph Structure:
              
                1-----3
              /       | \
             0        |  5---6
              \       | /
               2------4
         */

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];

        // Run BFS for all components of the graph
        System.out.println("BFS Traversal:");
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                bfs(graph, vis, i);
            }
        }
        System.out.println();
    }
}
