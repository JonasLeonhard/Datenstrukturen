public class DLList<T>
{
    private DLNode<T> head;
    private DLNode<T> last;
    private int size;

    public DLList()
    {
        this.head=null;
        this.last=null;
        this.size=0;
    }

    public boolean isEmpty()
    {
        if (size==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public int size()
    {
        return size;
    }

    public DLNode<T> NodeAt(int index)
    {
        DLNode<T> current=null;

        if (index>size/2)
        {
            current=this.last;
            for (int i=size-2; i>=index; i--)
            {
                current=current.prev;
            }
        }
        else
        {
            current=this.head;
            for (int i=1; i<=index; i++)
            {
                current=current.next;
            }
        }

        return current;
    }

    public T get(int index)
    {
        return NodeAt(index).value;
    }

    public void add(int index, T e)
    {
        if (index==0&&size==0) // neuer ersten knoten
        {
            this.head=new DLNode<T>(e, null, null);
            this.last=this.head;
        }
        else if (index>0&&size>index) // node einschieben
        {
            // neuer node
            // mit verweis
            // auf die
            // knoten
            // zwischen
            // die
            // eingeschoben
            // wird
            DLNode<T> before=NodeAt(index-1);
            DLNode<T> node=new DLNode<T>(e, before, before.next);

            // alte knoten mit neuen zurück verlinken:
            before.next=node;
            before.next.prev=node;
        }
        else if (index==0&&size>0) // neuer startpunkt
        {
            this.head.prev=new DLNode<T>(e, null, this.head); // neuer node vor
                                                              // head
            this.head=this.head.prev; // zurück verlinken von altem head auf
                                      // neuen
        }
        else if (index>0&&index==size) // nach letzen knoten einfügen
        {
            this.last.next=new DLNode<T>(e, last, null); // knoten verweist auf
                                                         // last
            this.last=this.last.next; // neuer node zu last
        }

        size++;
    }
}
