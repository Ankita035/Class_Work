import java.util.Scanner;

class Bank
{
	public float balance=50000,amount=0;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Your previous balance is: "+balance);
		System.out.println("Enter a Deposit amount:");
		amount=sc.nextFloat();
		System.out.println("Enter a Withdraw amount: ");
		amount=sc.nextFloat();
	}
}
class Derived extends Bank
{
	public void display()
	{
		balance=balance+amount;
		System.out.println("Your current balance is : "+balance);
		balance=balance-amount;
		System.out.println("Your current balance is : "+balance);

	}
}
public class InheriBank
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.accept();
		d.display();
	}
}