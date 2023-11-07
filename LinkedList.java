import java.util.*;

public class LinkedList
{
	public static void main(String args[])
	{
		LinkedList<String> el = new LinkedList<String>();	//Creating linkedlist
		el.add("Vijay");				//Adding object in linkedlist
		el.add("Vaibhav");
		el.add("Diksha");
		el.add("Driti");
		
		Iterator<String> itr = el.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}