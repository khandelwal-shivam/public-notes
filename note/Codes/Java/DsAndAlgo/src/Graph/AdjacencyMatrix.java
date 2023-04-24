package Graph;

public class AdjacencyMatrix {
    private int numberOfVertices;
    private int numberOfEdges;
    private int[][] adjMatrix;

    public AdjacencyMatrix(int nodes) {
        this.numberOfVertices = nodes;
        this.numberOfEdges = 0;
        this.adjMatrix = new int[nodes][nodes];

    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
    }
    public static void main(String[] args) {

    }
}
