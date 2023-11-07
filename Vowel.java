// WAP to accept Character from user and make a decision whether it is vowel or consonant.

import java.util.Scanner;
	
class Vowel
{
	public static void main(String args[])
	{
		char alpha;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Alphabet : ");
		alpha=sc.next().charAt(0);
		
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
		{
			System.out.println("The Alphabet is vowel");
		}
		else if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
		{
			System.out.println("The Alphabet is vowel");
		}
		else
		{
			System.out.println("The Alphabet is consonant");
		}
	}
}