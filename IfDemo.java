/* Note: When we are using conditional statements we make use of comparison operators <,>,<=,>=,==,!= */

import java.util.Scanner;

public class IfDemo
{ 	
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		num=sc.nextInt();
		
		if(num>5) 
		{	
			System.out.println("Welcome to java programming");
		}
		System.out.println("Enjoy");
	}
}