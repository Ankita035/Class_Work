//WAP to get sum of the numbers in array

import java.util.Scanner;

class SumArray
{
	public static void main(String args[])
	{
		int i, sum=0;								//Variable declaration
		int[] arr=new int[7];							//Array declaration
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter seven numbers: ");
		for(i=0;i<7;i++)
		{
			arr[i]=sc.nextInt();						//taking input from user
		}
		
		for(i=0;i<7;i++)
		{
			sum=sum+arr[i];
		}

		System.out.println("The Sum of the numbers is :"+sum);
		System.out.println("The Average of the numbers is :"+(sum/7.0));
		sc.close();
	}
}