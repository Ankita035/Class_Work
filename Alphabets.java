/*WAP to enter a letter and change the case of that letter and also print the ACSII value of it */

import java.util.*;

public class Alphabets
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char chr1, chr2;
		System.out.println("Enter a Character: ");
		chr1 = input.next().charAt(0);
		if(Character.isUpperCase(chr1) == true)
		{
			chr2 = Character.toLowerCase(chr1);
			System.out.println("The LowerCase of "+chr1+" is "+chr2);
			System.out.println("The ASCII value of "+chr1+" is "+(int)chr2);
		}
		else
		{
			chr2 = Character.toUpperCase(chr1);
			System.out.println("The LowerCase of "+chr1+" is "+chr2);
			System.out.println("The ASCII value of "+chr1+" is "+(int)chr2);
		}
	}
}