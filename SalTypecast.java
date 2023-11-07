//WAP to accept salary from user and typecast it into double after adding bonus(11% of salary) into it.

import java.util.Scanner;

public class SalTypecast 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your salary: ");
		int salary = sc.nextDouble();

		double totalSalary = (double) salary;
		totalSalary = totalSalary + ((salary/100)*11);

		System.out.println("Total salary after adding bonus: " + totalSalary);
	}
}