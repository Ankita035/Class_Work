/*	
	declaration and initialization of variable;
	while(test condition)
	{
		code body;
		i++;
	}			*/

// WAP to find sum of Digits.

import java.util.Scanner;

class SoDigit
{
	public static void main(String args[])
	{
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();

		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The Sum of digits is : "+sum);
	}
}