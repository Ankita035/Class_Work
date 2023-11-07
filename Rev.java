// WAP to accept number from user and Do reverse of it.

import java.util.Scanner;

class Rev
{
	public static void main(String args[])
	{
		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		num=sc.nextInt();

		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("The reverse of the numbers are : "+rev);
	}
}
			