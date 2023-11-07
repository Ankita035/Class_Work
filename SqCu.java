/* Program to accept the number from user, if it odd find the cube of the number otherwise find the square of the number.(Do not accept Zero)  */ 

import java.util.Scanner;

class SqCu
{
	public static void main(String args[])
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num=sc.nextInt();

		if(num==0)
		{
			System.out.print("Zero is not acceptable");
			
		}
		else if(num%2==0)		
		{
			System.out.print("The square of the number is : "+(num*num));
			
		}
		else
		{
			System.out.print("The cube of the number is :"+(num*num*num));
		}
	}
}


	