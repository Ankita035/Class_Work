//program to swap two numbers

import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();

		temp=a;
		a=b;
		b=temp;

		System.out.println("The value of a is"+a+"the valur of b is"+b);
		sc.close();
		}
}