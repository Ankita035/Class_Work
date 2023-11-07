// Accept array of the integer with size 10. Take data from user and Ask user to search an element and find whether that element is present in the given array or not. If present then mention index number as well

import java.util.Scanner;

public class SearchArray
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];					//declaration of array
									//taking input from user
		System.out.println("Enter 10 integers:");
		for (int i=0; i<10; i++) 
		{
			arr[i]=sc.nextInt();
		}
									//searching the element
		System.out.print("Enter the element you want to search: ");
		int sElement=sc.nextInt();
		int foundIndex=-1;
		for (int i=0; i<10; i++) 
		{
			if (arr[i] == sElement) 
			{
				System.out.println("The Element " + sElement + "is found in the array and its at index " + arr[i]);
				break;
			}
		}
									//displaying the outpur if the element is present in an array or not
		if (foundIndex!=-1)
		{
			System.out.println("The Element " + sElement + " not found in the array.");
		}
		sc.close();
	}
}