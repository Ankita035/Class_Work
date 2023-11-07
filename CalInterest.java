/*WAP to calculate interest rate of Fixed deposit or Saving Interest based on choice provided by user whether he wants to keep money for fixed deposit or saving. Interest Rate for fixed Deposit is 7% and for saving it is 3.5%.		*/

import java.util.Scanner;

class CalInterest
{
	public static void main(String args[])
	{
		int ch;
		double principle_amt,time,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Principle Amount: ");
		principle_amt=sc.nextDouble();
		System.out.println("Enter the Time period in years: ");
		time=sc.nextDouble();
		System.out.println("If you want to deposit your money in Fix Deposit or Saving Account ");
		System.out.println(" Choose from Given option ");
		System.out.println("Write 1 for Saving and 2 for Fixed Deposit ");
		ch=sc.nextInt();

		switch(ch)
		{
			case 1:
				si=(principle_amt*time*3.5)/100;
				System.out.println("The Interest Rate for your Savings is : "+si);
				break;
			case 2:
				si=(principle_amt*time*7)/100;
				System.out.println("The Interest Rate for Savings is : "+si);
				break;
			default:
				System.out.println("INVALID INPUT");
				break;
		}
	}
}