/* Write a Java program to create an ArrayList of integers and perform the following operation:
a.Add elements to the ArrayList.
b.Remove an elements from a specific index.
c.Update an element at a specific index	*/

import java.util.*;

public class ArrayListOP1
{
	public static void main(String args[])
	{
		ArrayList<Integer> employeelist = new ArrayList<Integer>();	//Creating arraylist
		employeelist.add(1);				//Adding object in arraylist
		employeelist.add(2);
		employeelist.add(3);
		employeelist.add(4);
								//printing the arraylist object
		System.out.println(employeelist);
						//remove particular element
		int id1 = employeelist.remove(2);
		System.out.println("Updated EmployeeList: "+employeelist);
		System.out.println("Removed Element: "+id1);
	
								//modify array list
		employeelist.set(2,10);
		System.out.println("Modified EmployeeList: "+employeelist);
		
								//to access particular value
		int id = employeelist.get(1);
		System.out.println("Employee id at index 1: "+id);
	
	}
}