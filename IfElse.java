/*  	if(test condition)
	{ 
	block of code;
	}
	else
	{
	block of code;
	} 			*/

import java.util.Scanner;

class IfElse
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("###### Enter a number ######");
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("You have entered a Positive Integer:"+num);
		}
		else
		{
			System.out.println("You have entered a Negative Integer:"+num);
		}
		sc.close();
	}
}