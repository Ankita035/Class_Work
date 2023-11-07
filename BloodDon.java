//WAP to accept age and weight and make a decision whether he can donate blood or not.

import java.util.Scanner;

class BloodDon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age=sc.nextInt();
		System.out.println("Enter the weight : ");
		int weight=sc.nextInt();
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("You are Elible to Donated the Blood");
			}
			else
			{
				System.out.println("You are not eligible to donate because of your weight");
		}
		else
		{
			System.out.println("You are not Eligible to donate Blood beace og your Age");
		}
	}
}