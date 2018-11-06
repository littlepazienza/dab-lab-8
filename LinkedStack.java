import java.util.EmptyStackException;

public class LinkedStack<E>
{
	private Node top;

	public E pop()throws Exception
	{
		if(top == null)
			throw new Exception("Cannot pop an empty stack");

		E temp = top.data;

		top = top.next;

		return temp;
	}

	public LinkedStack()
	{
		top= null;
	}

	private class Node
	{
		private E data;
		private Node next;
		
		public Node(E data, Node next)
		{
			this.data = data;
			this.next = next;
		}

	}

	/**
	  * Returns true if this stack is empty.
	  *
	  * @return true if this stack is empty; false otherwise
	  */
	public boolean isEmpty() {
		return top == null;
	}

  public void push(E item) {
    Node oldfirst = top;
    top = new Node( );
    top.data  = item;
    top.next = oldfirst;

  }


}


