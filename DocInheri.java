import java.util.Scanner;

class Doctor
{
	public void accept()
	{
		System.out.println("Your previous balance is: "+balance);
	}
}
class Surgeon extends Doctor
{
	public void display()
	{
		System.out.println("Your current balance is : "+balance);
	}
}
class Nurse extends Doctor
{
	public void display()
	{
		System.out.println("Your current balance is : "+balance);
	}
}

public class DocInheri
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.accept();
		d.display();
	}
}