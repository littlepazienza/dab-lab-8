public class LinkedStack<E> implements StackInterface<E>
{
	private Node top;

	public E pop() throws StackException
	{
		if(top == null)
			throw new StackException("Cannot pop an empty stack");

		E temp = top.data;

		top = top.next;

		return temp;
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

}


