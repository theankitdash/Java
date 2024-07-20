import java.util.ArrayList;
import java.util.Scanner;

public class adj_matrix_list {
    private int vertices;
    private int[][] adjacencyMatrix;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public adj_matrix_list(int vertices) {
        this.vertices = vertices;

        // Initialize the adjacency matrix
        adjacencyMatrix = new int[vertices][vertices];
        
        // Initialize the adjacency list
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        // Add edge to the adjacency matrix
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;

        // Add edge to the adjacency list
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
        int numVertices = 5;
        adj_matrix_list graph = new adj_matrix_list(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printAdjacencyMatrix();
        System.out.println();
        graph.printAdjacencyList();
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();
        adj_matrix_list graph = new adj_matrix_list(numVertices);

        System.out.print("Enter the number of edges: ");
        int numEdges = scanner.nextInt();

        System.out.println("Enter the edges (source destination):");
        for (int i = 0; i < numEdges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        scanner.close();

        graph.printAdjacencyMatrix();
        System.out.println();
        graph.printAdjacencyList();
    }
}
