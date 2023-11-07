//WAP to find if the number is Armstrong number or not.

import java.util.Scanner;

class Arm
{
	public static void main(String args[])
	{
		int num,rem,arm=0,input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		num=sc.nextInt();
		input=num

		while(num>0)
		{
			rem=num%10;
			arm=((rem)^3)+arm;
			num=num/10;
		}
		if(arm==input)
		{
			System.out.println("The Given number is an Armstrong number.");
		}
		else
		{
			System.out.println("The Given number is an Not Armstrong number.");
		}

	}
}
			