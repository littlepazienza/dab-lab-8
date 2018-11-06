public class LinkedList
{
	protected Node head;

	protected class Node
	{
		protected int data;
		protected Node next;
		
		public boolean hasNext()
		{
			if(next == null)
				return false;
			return true;
		}

		public int compare(int data)
		{
				return this.data - data;
		}

		public void next();
		{
			data = next.data;
			next = next.next;
		}

	}

	public boolean search(int needle)
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

}
