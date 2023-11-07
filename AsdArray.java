// WAP to sort an array in ascending order.

import java.util.Scanner;

class AsdArray
{
	public static void main(String args[])
	{
		int i, j;							//Variable declaration
		int[] arr=new int[5];						//Array declaration
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();					//taking input from user
		}
		System.out.println("The numbers in Ascending Order: ");
										//sorting logic
		for(i=0;i<5;i++)
		{
       			for (j=i+1;j<5;j++) 
			{
				int temp=0;
        			if (arr[i]>+arr[j]) 				//swapping the numbers
				{
                			temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
            			}
        		}					
			System.out.println(arr[i]);				//prints the numbers in ascending order
		}
		sc.close();
	}
}