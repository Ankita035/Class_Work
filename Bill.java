/* Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with help of the below charges:
- 1 to 100 units = Rs.10/unit
- 100 to 200 units = Rs.15/unit
- 200 to 300 units = Rs.20/unit
- above 300 units = Rs.25/unit 				*/

import java.util.Scanner;

class Bill
{
	public static void main(String args[])
	{
		int unit,bill;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your units for calculating : ");
		unit=sc.nextInt();

		if(unit<=100)
		{
			bill = unit*10;
		}
		else if(unit<=200)
		{
			bill = unit*10+(unit - 100)*15;
		}
		else if(unit<=300)
		{
			bill = (100*10)+(100*15)+(unit-200)*20;
		}
		else if(unit>300)
		{
			bill = (100*10)+(100*15)+(100*20)+(unit-300)*25;
		}
		System.out.println("The electricity bill for "+unit+" is : "+bill);
		sc.close();
	}
}