// Create a bank class with withdraw and deposit methods, assign balance amount and perform the said operation.

import java.util.Scanner;

class Bank
{
	public float balance=5000,amount=0;
	Scanner sc=new Scanner(System.in);
	public void Deposit()
	{
		System.out.println("Your remaining balance is: "+balance);
		System.out.println("Enter a Deposit amount: ");
		amount=sc.nextFloat();		
		balance=balance+amount;
		System.out.println("Your current balance is: "+balance);
	}
	public void Withdraw()
	{
		System.out.println("Enter a withdrawal amount: ");
		amount=sc.nextFloat();
		balance=balance-amount;
		System.out.println("Your current balance: "+balance);
	}
}
public class Bank1
{
	public static void main(String args[])
	{
		Bank bk=new Bank();
		bk.Deposit();
		bk.Withdraw();
	}
}