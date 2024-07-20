import java.util.ArrayList;
import java.util.Arrays;

class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class shortest_path {
    private int vertices;
    private ArrayList<ArrayList<Edge>> adjacencyList;

    public shortest_path(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Edge(source, destination, weight));
    }

    // Dijkstra's Algorithm to find the shortest path from the source node to all nodes
    public int[] dijkstra(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices - 1; i++) {
            int minVertex = findMinDistanceVertex(distance, visited);
            visited[minVertex] = true;

            for (Edge edge : adjacencyList.get(minVertex)) {
                int newDist = distance[minVertex] + edge.weight;
                if (newDist < distance[edge.destination]) {
                    distance[edge.destination] = newDist;
                }
            }
        }

        return distance;
    }

    private int findMinDistanceVertex(int[] distance, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minVertex = i;
            }
        }

        return minVertex;
    }

    // Bellman-Ford Algorithm to find the shortest path from the source node to all nodes
    public int[] bellmanFord(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 1; i < vertices; i++) {
            for (Edge edge : getEdges()) {
                if (distance[edge.source] != Integer.MAX_VALUE && distance[edge.source] + edge.weight < distance[edge.destination]) {
                    distance[edge.destination] = distance[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative weight cycles
        for (Edge edge : getEdges()) {
            if (distance[edge.source] != Integer.MAX_VALUE && distance[edge.source] + edge.weight < distance[edge.destination]) {
                System.out.println("Graph contains negative weight cycle!");
                return null;
            }
        }

        return distance;
    }

    private ArrayList<Edge> getEdges() {
        ArrayList<Edge> edges = new ArrayList<>();
        for (ArrayList<Edge> list : adjacencyList) {
            edges.addAll(list);
        }
        return edges;
    }

    // Floyd-Warshall Algorithm to find the shortest path between all pairs of nodes
    public int[][] floydWarshall() {
        int[][] distance = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
            distance[i][i] = 0;
        }

        for (int i = 0; i < vertices; i++) {
            for (Edge edge : adjacencyList.get(i)) {
                distance[edge.source][edge.destination] = edge.weight;
            }
        }

        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    if (distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                    }
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        int numVertices = 5;
        shortest_path graph = new shortest_path(numVertices);

        graph.addEdge(0, 1, 6);
        graph.addEdge(0, 3, 1);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 2);
        graph.addEdge(3, 2, 5);
        graph.addEdge(3, 4, 7);
        graph.addEdge(2, 4, 1);

        int sourceNode = 0;

        // Dijkstra's Algorithm
        int[] shortestDistancesDijkstra = graph.dijkstra(sourceNode);
        System.out.println("Shortest distances from node " + sourceNode + " using Dijkstra's Algorithm:");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Node " + i + ": " + shortestDistancesDijkstra[i]);
        }

        // Bellman-Ford Algorithm
        int[] shortestDistancesBellmanFord = graph.bellmanFord(sourceNode);
        if (shortestDistancesBellmanFord != null) {
            System.out.println("\nShortest distances from node " + sourceNode + " using Bellman-Ford Algorithm:");
            for (int i = 0; i < numVertices; i++) {
                System.out.println("Node " + i + ": " + shortestDistancesBellmanFord[i]);
            }
        }

        // Floyd-Warshall Algorithm
        int[][] shortestDistancesFloydWarshall = graph.floydWarshall();
        System.out.println("\nShortest distances between all pairs of nodes using Floyd-Warshall Algorithm:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.println("Distance from node " + i + " to node " + j + ": " + shortestDistancesFloydWarshall[i][j]);
            }
        }
    }
}

