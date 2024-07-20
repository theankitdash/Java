import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge> {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }
}

public class minimum_spanning_tree {
    private int vertices;
    private ArrayList<ArrayList<Edge>> adjacencyList;

    public minimum_spanning_tree(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Edge(source, destination, weight));
        adjacencyList.get(destination).add(new Edge(destination, source, weight));
    }

    // Prim's Algorithm to find Minimum Spanning Tree
    public ArrayList<Edge> primMST() {
        ArrayList<Edge> mst = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();

        Arrays.fill(visited, false);
        minHeap.add(new Edge(-1, 0, 0));

        while (!minHeap.isEmpty()) {
            Edge currentEdge = minHeap.poll();

            int currentVertex = currentEdge.destination;
            if (visited[currentVertex]) {
                continue;
            }

            visited[currentVertex] = true;
            mst.add(currentEdge);

            for (Edge neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor.destination]) {
                    minHeap.add(neighbor);
                }
            }
        }

        return mst;
    }

    // Kruskal's Algorithm to find Minimum Spanning Tree
    public ArrayList<Edge> kruskalMST() {
        ArrayList<Edge> mst = new ArrayList<>();
        DisjointSet disjointSet = new DisjointSet(vertices);

        PriorityQueue<Edge> minHeap = new PriorityQueue<>(adjacencyList.size());

        for (ArrayList<Edge> edges : adjacencyList) {
            minHeap.addAll(edges);
        }

        while (!minHeap.isEmpty()) {
            Edge currentEdge = minHeap.poll();

            int rootSource = disjointSet.find(currentEdge.source);
            int rootDestination = disjointSet.find(currentEdge.destination);

            if (rootSource != rootDestination) {
                mst.add(currentEdge);
                disjointSet.union(rootSource, rootDestination);
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        int numVertices = 6;
        minimum_spanning_tree graph = new minimum_spanning_tree(numVertices);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.addEdge(2, 5, 5);

        System.out.println("Minimum Spanning Tree using Prim's Algorithm:");
        ArrayList<Edge> primMST = graph.primMST();
        for (Edge edge : primMST) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }

        System.out.println("\nMinimum Spanning Tree using Kruskal's Algorithm:");
        ArrayList<Edge> kruskalMST = graph.kruskalMST();
        for (Edge edge : kruskalMST) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
    }
}

class DisjointSet {
    int[] parent;
    int[] rank;

    public DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            return;
        }

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}

