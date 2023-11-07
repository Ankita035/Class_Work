//Calculate total salary of Employee

import java.util.Scanner;
class Salary
{
	public static void main(String args[])
	{
		int basicSal;
		float da;
		double hra,gross;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Basic Salary");
		basicSal=sc.nextInt();
		System.out.println("Enter your Daily allowance");
		da=sc.nextFloat();
		System.out.println("Enter yor hra");
		hra=sc.nextDouble();

		gross=basicSal+da+hra;
		System.out.println("The total Salary is:"+gross);
		sc.close();
		}
}