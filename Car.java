/* Mr.John wants to buy a car but needs color of the car as blue. And in Car showroom there are black, white, red and blue cars are available. Now accept some basic Information from the user and based on that make decision whether blue car is available or not.*/

import java.util.Scanner;

class Car
{
	public static void main(String args[])
	{
		String str1,ch,brand;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		str1=sc.nextLine();
		System.out.println("Please enter the Brand of the car you want: ");
		brand=sc.nextLine();
		System.out.println("Please write the colour you want : Red, Blue, Black, White ");
		ch=sc.nextLine();

		switch(ch)
		{
			case "Red":
				System.out.println("Congratulations!! You have purchased Red colour in "+brand);
				break;
			case "Blue":
				System.out.println("Congratulations!! You have purchased Blue colour in "+brand);
				break;
			case "Black":
				System.out.println("Congratulations!! You have purchased Black colour in "+brand);
				break;
			case "White":
				System.out.println("Congratulations!! You have purchased White colour in "+brand);
				break;
			default:
				System.out.println("Sorry."+ch+"is not available.");
				break;
		}
	}
}