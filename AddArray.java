// WAP to accept 5 input for two arrays and add them.

import java.util.Scanner;

public class AddArray
{
	public static void main(String args[])
	{
		int i;
		int[] a=new int[5];				//Array declaration
		int[] b=new int[5];
		int[] sum=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Five values");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();			//Input from user
		}
		System.out.println("Enter Other Five Values");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			sum[i]=a[i]+b[i];			//Sum of two Arrays
		}
		System.out.println("The Addition of numbers is: ");
		for(i=0;i<5;i++)
		{
			System.out.println(sum[i]);
		}
		sc.close();
	}
}