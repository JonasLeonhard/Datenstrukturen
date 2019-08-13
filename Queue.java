
public class Queue<T>
{
    private Node<T> head;
    private Node<T> last;

    public Queue()
    {
        this.head=null;
        this.last=null;
    }

    public void add(T e)
    {
        Node<T> node=new Node<T>(e, null);

        if (this.last==null)
        {
            this.head=node;
            this.last=node;
        }
        else
        {

            this.last.next=node;
            this.last=node;
        }
    }

    public T remove()
    {
        T value=this.head.value;
        this.head=this.head.next;

        if (this.head==null)
        {
            this.last=null;
        }
        return value;

    }
}
