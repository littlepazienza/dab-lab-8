public class LinkedList
{ 
  protected Node head;
  protected class Node
  { 
    protected int data;
    protected Node next;
    
    private boolean hasNext()
    { 
      if(next == null)
        return false;
      else
        return true;
    }
  }
  
  protected boolean search(int needle, Node current)
  { 
    if(current.data == needle)
      return true;
    else
    { 
      if(current.hasNext())
        current = current.next;
      else
        return false;
      return search(needle, current);
    }
  }
}

