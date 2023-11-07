// Program that takes a year from the user and print whether it is leap year or not.

import java.util.Scanner;

class Leapyr
{
	public static void main(String args[])
	{ 
		int yr;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Year: ");
		yr=sc.nextInt();

		if((yr%4==0 && yr%100!=0) || (yr%400==0))
		{
			System.out.print("The Given year is Leap Year");
			
		} 
		else
		{
			System.out.print("The Given year is Not Leap Year");
		} 
		sc.close();
	}
}
