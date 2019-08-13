
public class SLList<T> // singly linked list <Generics>
{
    Node<T> head;

    public SLList()
    {
        this.head=null;
    }

    public boolean isEmpty()
    {
        return this.head==null;
    }

    public T get(int index)
    {
        return nodeAt(index).value; // .val macht aus Node<T>(T value, Node<T>
                                    // next) --> gibt das T value.
    }

    public void add(int index, T e)
    {
        if (index==0)
        {
            this.head=new Node<T>(e, this.head); // neuer knoter e/null//
                                                 // setzt knoten vor ersten
                                                 // knoten(setzt ihn als
                                                 // head)

        }
        else
        {

            Node<T> pred=nodeAt(index-1);// vorgänger
            pred.next=new Node<T>(e, pred.next); // new node head von pred

        }
    }

    public void add(T e)
    {
        if (this.head==null)
        {
            this.head=new Node<T>(e, null);
        }
        else
        {

            Node<T> current=this.head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=new Node<T>(e, null);

        }
    }

    private Node<T> nodeAt(int index) // Hilfsmethode
    {
        Node<T> current=this.head;
        for (int i=0; i<index; i++)
        {
            current=current.next; // nach jedem durchlauf steht in current der
                                  // nachfolger des [i]ten knoten. läuft bis zum
                                  // mitgegebenen Wert. und gibt current zurück.
        }
        return current;
    }

}
