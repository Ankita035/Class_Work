// WAP to accept Character from user and make a decision whether it is vowel or consonant.

import java.util.Scanner;

public class Alphach
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet :");
		ch=sc.nextInt();

		switch(ch)
		{
			case 'a':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'e':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'i':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'o':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'u':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'A':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'E':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'I':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'O':
				System.out.println("The Alphabet is Vowel.");
				break;
			case 'U':
				System.out.println("The Alphabet is Vowel.");
				break;
			default:
				System.out.println("The Alphabet is Consonant.");
				break;
		}
	}
}