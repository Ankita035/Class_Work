// Write a Java program that reads a string input from user. Convert the string to an Integer.parseInt() method. Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. Display a message indicating that the input is not a valid integer.

import java.util.Scanner;

public class StringInteger
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = sc.nextLine();
		try 
		{
			int num=Integer.parseInt(input);
			System.out.println("The Converted String to Integer is: " + num);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("The Input is not a valid integer");
		}
	}
}  