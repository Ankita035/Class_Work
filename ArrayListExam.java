	import java.util.*;

public class ArrayListExam
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();	//Creating arraylist
		list.add("Mango");				//Adding object in arraylist
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
								//printing the arraylist object
		System.out.println(list);
								//to access particular value
		String str = list.get(1);
		System.out.println("Element at index 1: "+str);
								//modify array list
		list.set(2,"Plum");
		System.out.println("Modified ArrayList: "+list);
								//remove particular element
		String str1 = list.remove(2);
		System.out.println("Updated ArrayList: "+list);
		System.out.println("Removed Element: "+str1);
	}
}