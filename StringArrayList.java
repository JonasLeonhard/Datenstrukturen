

public class StringArrayList
{

    private String[] stringarray;
    private int size;

    public StringArrayList()
    {
        stringarray=new String[3];
        size=0;
    }

    public boolean isEmpty()
    {
       return stringarray.length == 0;
        
    }

    public int size()
    {
        return size;
    }

    public String get(int index)
    {
        String s=null;

        if (stringarray!=null&&index<size)
        {
            s=stringarray[index];
        }

        return s;
    }

    public void add(int index, String s)
    {
        if (size>=stringarray.length)
        {
            stringarray=Arrays.expandArray(stringarray);
        }
        
        if (index<size)
        {
            Arrays.shiftElements(stringarray, index);
        } 

        if (stringarray!=null&&index<=size)
        {
            stringarray[index]=s; // setzt s and neuen platz
            size++;
        }
    }
}
