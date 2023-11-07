/* St. Xaviers School displays a notice on the school notice board regarding admission in Std.XI for choosing different streams, according to marks obtained in English,Maths and Science in ICSE Examinations.
English, Maths and Science >=80% 		Pure Science
English, Science >=80% Maths >=60%		Bio. Science
English, Maths, Science >=60%			Commerce 				*/

import java.util.Scanner;

class Stream
{
	public static void main(String args[])
	{
		int eng,maths,sci;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your English marks : ");
		eng=sc.nextInt();
		System.out.println("Enter your Maths marks : ");
		maths=sc.nextInt();
		System.out.println("Enter your Science marks : ");
		sci=sc.nextInt();

		if(eng>=80 && maths>=80 && sci>=80)
		{
			System.out.print("You are alloted to admit in Pure Science");
		}
		else if(eng>=80 && maths>=60 && sci>=80)
		{
			System.out.println("You are alloted to admit in Bio. Science");
		}
		else if(eng>=60 && sci>=60 && maths>=60)
		{
			System.out.println("You are alloted to admit in Commerce");
		}
		else
		{
			System.out.println("Please try different Stream");
		}
	}
}