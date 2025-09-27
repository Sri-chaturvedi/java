package GRAPS.Adjecency_List.Undirectional_UnWeighted_Graph;

import java.util.ArrayList;

public class UDUW {
    
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
     * Function to create an undirected & unweighted graph
     * Graph is stored as adjacency list
     */
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (both directions, since undirected)
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 0));

        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));

        graph[2].add(new Edge(2, 1));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        int V = 4; // number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // Print all neighbors of vertex 2
        System.out.print("Neighbors of vertex 2: ");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();
    }
}
