// WAP to accept a set of any 10 characters. Calculate and print the sum of ASCII codes of the characters.

import java.util.Scanner;

public class sumASCII
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int asciiSum=0;
		int charcount=10;
		System.out.println("Enter characters: ");
		
		for(int i = 0; i < charcount; i++)
		{
			System.out.print("Enter a character: ");
			char inputChar = sc.next().charAt(0);
			int asciiCode = (int)inputChar;

			System.out.println("ASCII code for "+inputChar+" : "+asciiCode);
			asciiSum = asciiCode + asciiSum;
		}
		System.out.println("Sum of ASCII codes: "+asciiSum);
	}
}