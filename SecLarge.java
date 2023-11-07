//WAP to find the Second largest number in n array.

import java.util.Scanner;

class SecLarge
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
		
		for(i=0;i<5;i++)
		{
       			for (j=i+1;j<5;j++) 
			{
				int largest=0;
        			if (arr[i]>largest) 				//swapping the numbers
				{
                			largest= arr[i];
					arr[i]=arr[j];
					arr[j]=largest;
            			}
        		}					
		}
		System.out.println(arr[i]);					//prints the Second largest number
		System.out.println("The Second Largest number is: "+arr[1]);
		sc.close();
	}
}