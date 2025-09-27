package GRAPS.Adjecency_List.UNdirectional_Weighted_Graph;

import java.util.ArrayList;

public class UDWG {
    
    // Edge class represents a weighted edge between two vertices
    static class Edge {
        int src;    // source vertex
        int dest;   // destination vertex
        int weight; // edge weight

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Function to create an undirected weighted graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (both directions for undirected graph)
        graph[0].add(new Edge(0, 2, 2));
        graph[2].add(new Edge(2, 0, 2));

        graph[1].add(new Edge(1, 3, 10));
        graph[3].add(new Edge(3, 1, 10));

        graph[2].add(new Edge(2, 1, 5));
        graph[1].add(new Edge(1, 2, 5));

        graph[2].add(new Edge(2, 3, 3));
        graph[3].add(new Edge(3, 2, 3));
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // Print all neighbors of vertex 2
        System.out.println("Neighbors of vertex 2:");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Vertex: " + e.dest + " , Weight: " + e.weight);
        }
    }
}
