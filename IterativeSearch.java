public class IterativeSearch
{
  protected Node head = new Node();

  protected class Node
  {
    protected int data;
    protected Node next;
    
    public boolean hasNext()
    {
      if (next == null)
         return false;
      return false;
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
  
  public boolean search(int needle)
  {
    Node current = new Node();
    current = head;

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
