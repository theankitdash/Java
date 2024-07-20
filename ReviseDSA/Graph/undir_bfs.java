import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class undir_bfs {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public undir_bfs(int vertices) {
        this.vertices = vertices;

        // Initialize the adjacency list
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // BFS for detecting cycles in an undirected graph
    public boolean containsCycleUndirected() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicUndirected(i, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isCyclicUndirected(int startVertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            visited[currentVertex] = true;

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                } else if (neighbor != currentVertex) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int numVertices = 5;
        undir_bfs undirectedGraph = new undir_bfs(numVertices);

        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 3);
        undirectedGraph.addEdge(3, 4);

        System.out.println("Undirected graph contains a cycle: " + undirectedGraph.containsCycleUndirected());
    }
}

