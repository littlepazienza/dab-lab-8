public class Test
{
	public static void main(String[] args)
	{
		LinkedList theList = new LinkedList();

		theList.add(1);
		theList.add(4);
		theList.add(-4);
		theList.add(44);
		theList.add(12);
		theList.add(3);
		theList.add(7);

		System.out.println( (iterativeSearch(args[0])) ? "(ITERATIVE) I found " : "I could not find ");
		System.out.print(args[0] + "");

		System.out.println( (recursiveSearch(args[0])) ? "(RECURSIVE) I found " : "I could not find ");
		System.out.print(args[0] + "");

		System.out.println( (ooSearch(args[0])) ? "(OO) I found " : "I could not find ");
		System.out.print(args[0] + "");
	}

}

