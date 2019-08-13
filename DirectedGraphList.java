import java.util.ArrayList;
import java.util.List;

public class DirectedGraphList implements Graph
{
    private int size=0;
    private int maxsize=0;
    @SuppressWarnings("rawtypes")
    private ArrayList[] kanten;

    public DirectedGraphList(int maxsize)
    {
        this.maxsize=maxsize;

        this.kanten=new ArrayList[maxsize];

        for (int i=0; i<maxsize; i++)
        {
            kanten[i]=new ArrayList();
        }
    }

    @Override
    public int size()
    {
        return this.size;
    }

    @Override
    public boolean hasEdge(int node1, int node2)
    {

        return false;

    }

    @Override
    public void addEdge(int node1, int node2)
    {
        @SuppressWarnings("rawtypes")
        ArrayList a=new ArrayList();
        // fügt beide kanten an
        a.add(node1);
        a.add(node2);

        kanten[size]=a;
        size++;
    }

    @Override
    public void removeEdge(int node1, int node2)
    {

    }

    @Override
    public List<Integer> adjacentNodes(int node)
    {

        return null;
    }

    public String toString()
    {
        String retk="";
        for (int i=0; i<size; i++)
        {
           
            retk+=kanten[i];
        }
        
        String retg = "";
        
        return "V = {" + retg + "}\nE = {" + retk + "}\n";

    }
}
