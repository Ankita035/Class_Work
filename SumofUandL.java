// WAP to input set of N Charaters. Find and display the number of uppercase and lowercase characters. Assume that none of the charcter is a digit or a special character.

import java.util.*;

public class SumofUandL
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Characters you want ");
		int n=sc.nextInt();
		
		int upperCase = 0;
		int lowerCase = 0;
		for(int i = 0; i < n ; i++)
		{
			System.out.println("Enter the Characters");	
			char ch = sc.next().charAt(0);
			if (Character.isUpperCase(ch)) 
			{
                		upperCase++;
            		} 
			else if (Character.isLowerCase(ch)) 
			{
                		lowerCase++;
            		}
		}
		System.out.println("The number of UpperCase is :"+upperCase);
		System.out.println("The number of LowerCase is :"+lowerCase);
	}
}