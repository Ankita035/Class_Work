// WAP to accept five value from user and find minimum value from them.

import java.util.Scanner;

class MinArray
{
	public static void main(String args[])
	{
		int i, minValue;						//Variable declaration
		int[] min=new int[5];						//Array declaration
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Five numbers: ");
		for(i=0;i<5;i++)
		{
			min[i]=sc.nextInt();					//taking input from user
		}
		
		minValue = min[0];
       		for (i = 1; i < 5; i++) 					//finding the minimun value
		{
        		if (min[i] < minValue) 
			{
                		minValue = min[i];
            		}
        	}
		System.out.println("The minimum value is : "+minValue);		//prints the minimum value
	}
}