//WAP to find if the number is Palindrome number or not.

import java.util.Scanner;

class Pal
{
	public static void main(String args[])
	{
		int num,rem,pal=0,input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		num=sc.nextInt();
		input=num;

		while(num>0)
		{
			rem=num%10;
			pal=(pal*10)+rem;
			num=num/10;
		}
		if(pal==input)
		{
			System.out.println("The Given number is an Palindrome number.");
		}
		else
		{
			System.out.println("The Given number is an Not Palindrome number.");
		}

	}
}
			