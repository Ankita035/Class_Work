/*WAP that prompts the user to enter a positive integer and calculates its factorial using while loop. The program should display the factorial as an output.	*/ 

import java.util.Scanner;

public class Fact
{
	public static void main(String args[])
	{
		int num,fact=1,i=1;
		System.out.println("Enter the number for factorial");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("The Factorial of the number is : "+fact);
	}
}