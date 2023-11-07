// Write a Java program that reads an integer from user using Scanner class. Handle the InputMismatchException that can occur if the user enters a non-integer value. Display an appropriate error message.

import java.util.*;

public class ImissmatchExc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter an Integer");
			int a=sc.nextInt();
			System.out.println(a*a);
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("You got it");
		}
	}
}