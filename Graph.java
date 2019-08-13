import java.util.List;

public interface Graph
{

    List<Integer> adjacentNodes(int node);

    void removeEdge(int node1, int node2);

    void addEdge(int node1, int node2);

    boolean hasEdge(int node1, int node2);

    int size();

}
