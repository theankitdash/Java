import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class undir_dir_dfs {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public undir_dir_dfs(int vertices) {
        this.vertices = vertices;

        // Initialize the adjacency list
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    // DFS for detecting cycles in an undirected graph
    private boolean isCyclicUndirected(int currentVertex, boolean[] visited, int parent) {
        visited[currentVertex] = true;

        for (int neighbor : adjacencyList.get(currentVertex)) {
            if (!visited[neighbor]) {
                if (isCyclicUndirected(neighbor, visited, currentVertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public boolean containsCycleUndirected() {
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicUndirected(i, visited, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    // DFS for detecting cycles in a directed graph
    private boolean isCyclicDirected(int currentVertex, boolean[] visited, boolean[] recStack) {
        visited[currentVertex] = true;
        recStack[currentVertex] = true;

        for (int neighbor : adjacencyList.get(currentVertex)) {
            if (!visited[neighbor]) {
                if (isCyclicDirected(neighbor, visited, recStack)) {
                    return true;
                }
            } else if (recStack[neighbor]) {
                return true;
            }
        }

        recStack[currentVertex] = false;
        return false;
    }

    public boolean containsCycleDirected() {
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclicDirected(i, visited, recStack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int numVertices = 5;
        undir_dir_dfs undirectedGraph = new undir_dir_dfs(numVertices);
        undir_dir_dfs directedGraph = new undir_dir_dfs(numVertices);

        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 3);
        undirectedGraph.addEdge(3, 4);

        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(3, 1);
        directedGraph.addEdge(3, 4);

        System.out.println("Undirected graph contains a cycle: " + undirectedGraph.containsCycleUndirected());
        System.out.println("Directed graph contains a cycle: " + directedGraph.containsCycleDirected());
    }
}
