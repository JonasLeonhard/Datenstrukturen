import java.util.ArrayList;
import java.util.List;

public class DirectedGraph implements Graph
{
    private int size;
    private boolean[][] matrix;

    public DirectedGraph(int size)
    {
        this.matrix=new boolean[size][size];
        this.size=size;
    }

    @Override
    public int size()
    {
        return this.size;
    }

    @Override
    public boolean hasEdge(int node1, int node2)
    {
        return this.matrix[node1][node2];
    }

    @Override
    public void addEdge(int node1, int node2)
    {
        this.matrix[node1][node2]=true;
    }

    @Override
    public void removeEdge(int node1, int node2)
    {
        this.matrix[node1][node2]=false;
    }

    @Override
    public List<Integer> adjacentNodes(int node) // alle knoten auf die der
                                                 // übergebene Zeigt
    {
        List<Integer> result=new ArrayList<Integer>();
        for (int i=0; i<matrix.length; i++)
        {
            if (hasEdge(node, i))
            {
                result.add(i);
            }
        }
        return result;
    }
}
