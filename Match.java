// program to decide the winner of the match

import java.util.Scanner;

class Match
{
	public static void main(String args[])
	{
		int ind,pak;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the score of India : ");
		ind=sc.nextInt();
		System.out.print("Enter the score of Pakistan : ");
		pak=sc.nextInt();

		if(ind>pak && ind<=100)
		{
			System.out.println("India has won the match");
		}
		else if(ind<pak)
		{
			System.out.println("Pakistan has won the match");	
		}
		else
		{	
			System.out.println("The match is Draw");
		}
	}	
}