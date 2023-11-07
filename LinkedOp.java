/* 1)Creating a Linked list using the LinkedList class add programming languages.
2)Adding elements to the list in multiple ways i.e. 
direct add and adding elements to specific index 
Accessing elements of linedlist using get() and set()
How to remove the elements of the linked list	*/

import java.util.*;

public class LinkedOp 
{
	public static void main(String args[]) 
	{
		LinkedList<String> Languages = new LinkedList<String>();
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("C++");
		Languages.add("JavaScript");
		
		Iterator<String> itr = Languages.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Third element: " + Languages.get(2));  
							// Modifying element at index 1
		Languages.set(1, "Ruby");
		System.out.println("Updated LinkedList: " + Languages);  
							// Removing element at index
		Languages.remove(1);
		System.out.println("Updated LinkedList: " + Languages);    
	}
}