
public class Stack<T>
{
    private Node<T> head;
    

    public Stack()
    {
        this.head=null;
        
    }

    public boolean isEmpty()
    {
        return (this.head==null);
    }

    public T pop()
    {
        T value=this.head.value;
        this.head=head.next;
        
        
        return value;
        
    }

    public T peek()
    {
        return this.head.value; // returns last node.value
    }

    public void push(T e)
    {
        this.head=new Node<T>(e, this.head);
       

    }

    public String toString()
    {
        String s="";

        Node<T> current=this.head;
        while (current!=null)
        {

            s += current.value;
            
            if (current.next!=null)
            {
                s+=", ";
            }
            
            current=current.next;

        }
        return "["+s+"]";

    }
}
