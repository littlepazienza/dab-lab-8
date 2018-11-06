public class Test
{
	public static void main(String[] args)
	{
        	int[] array = {1, 2, 3, 4, 5, 6, 7}; 
		LinkedList theList = new LinkedList(array);

		System.out.println( (theList.iterativeSearch(3)) ? "(ITERATIVE) I found " : "I could not find ");
		System.out.print(3 + "");

		System.out.println( (theList.recursiveSearch(3)) ? "(RECURSIVE) I found " : "I could not find ");
		System.out.print(3 + "");

		System.out.println( (theList.ooSearch(3)) ? "(OO) I found " : "I could not find ");
		System.out.print(3 + "");
	}

}

