public class LinkedList
{ 
  protected class Node
  { 
    protected int data;
    protected Node next;
    
    protected Node(int data, Node next)
    {
      this.data = data;
      this.next = next;
    }

    protected boolean hasNext()
    { 
      if(next == null)
        return false;
      else
        return true;
    }

    public int compare(int data)
    {
      return this.data - data;
    }

    public void next()
    {
      data = next.data;
      next = next.next;   
    }

    public boolean isEmpty()
    {
      if (head == null)
      {
        return true;
      }
      else if (next != null)
      {
        return false;
      }
      return false;
    }
  }
  protected Node head;

  protected LinkedList(int[] args)
  {
    head = new Node(args[0], null);
    for(int i=1;i<args.length;i++)
    {
      Node temp = head;
      head = new Node(args[i], temp);
    }
  }

  protected boolean recursiveSearch(int needle, Node current)
  { 
    if(current == null)
      current = head;
    if(current.data == needle)
      return true;
    else
      if(current.hasNext()) 
        return this.recursiveSearch(needle, current.next);
      else
        return false;
  }

  public boolean ooSearch(int needle)
  {
    Node current = head;

    while(current.hasNext())
    {
      if(current.compare(needle) == 0)
        return true;
      current.next();
    }
      return false;
  }

  public boolean iterativeSearch(int needle)
  {
    Node current = head;

    if (current == null)
    {
      return false;
    }
    else
    {
      while(current != null)
      {
        if (current.data == needle)
        {
          return true;
        }
        else
        {
          current = current.next;
        }
      }
    }
    return false;
  }
}

