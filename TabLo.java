// WAP to accept number from user and generate table of it.

import java.util.Scanner;

class TabLo
{
	public static void main(String args[])
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to generate a table :");
		num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}