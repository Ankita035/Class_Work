package Infopack;
import java.util.Scanner;

public class UserDetails
{
	public static void main(String args[])
	{
		String name;
		int number, age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		name=sc.nextLine();
		System.out.println("Enter your Phone Number");
		number=sc.nextInt();
		System.out.println("Enter your Age");
		age=sc.nextInt();
		System.out.println("Your Name is "+name);
		System.out.println("Your Phone number is "+number);
		System.out.println("Your Age is "+age);
	}
} 