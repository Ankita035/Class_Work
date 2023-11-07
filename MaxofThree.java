// To accept three numbers from user and make decision which is the greatest number among three

import java.util.Scanner;

class MaxofThree
{
	public static void main(String args[])
	{	
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1=sc.nextInt();
		System.out.print("Enter second number : ");
		num2=sc.nextInt();
		System.out.print("Enter third number : ");
		num3=sc.nextInt();

		if(num1>num2 && num1>num3)
		{
			System.out.println("The greatest number is : "+num1);
		}
 		else if(num2>num3)
		{
			System.out.println("The greatest number is : "+num2);
		}
		else
		{	
			System.out.println("The greatest number is : "+num3);
		}
		sc.close();
	}	
}