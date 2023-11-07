/* WAP to get details of vehicle i.e. Bike and Car. Overriding engine() method to describe both bike and car. Create Vehicle as base class and Bike, Car as Derived Class.	*/

import java.util.Scanner;

class Vehicle
{
	public void accept(int a,int b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		a=sc.nextInt();
		System.out.println("Enter Second number");
		b=sc.nextInt();
	}
}
class Car extends Vehicle
{
	public void display(int a,int b)
	{
		int sum=a+b;
		System.out.println("The Addition is : "+sum);
	}
}
public class VehicleCar
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.accept();
		d.display();
	}
}