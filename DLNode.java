public class DLNode<T>
{

    T value;
    DLNode<T> next;
    DLNode<T> prev;

    public DLNode(T value, DLNode<T> prev, DLNode<T> next)
    {
        this.value=value;
        this.prev=prev;
        this.next=next;
        
    }
}
