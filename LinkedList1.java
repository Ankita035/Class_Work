/*	Create a method to find the average of all the elements in a LinkedListn of integers.
*Test your method with a sample LinkedList	*/

import java.util.*;

public class LinkedList1
{
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<Integer>();	//Creating arraylist
		list.add(1);				//Adding object in arraylist
		list.add(2);
		list.add(3);
		list.add(4);

		Iterator<Integer> itr = list.iteration();
		
		double sum = 0;
		int count = 0;
		double avg;
		while(itr.hasNext())
		{
			int element = itr.next();
			sum = sum + element;
			count++;
		}
		if(count>0)
		{
			avg = sum/count;
			System.out.println("Average of LinkedList: "+avg);
		}
		else
		{
			System.out.println("LinkedList is Empty");
		}
	}
}