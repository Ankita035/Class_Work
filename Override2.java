//WAP to get details of vehicle i.e.Bike and Car. Override engine() method to describe both bike and car.

class Vehicle
{
	void engine()
	{
		System.out.println("This is a engine for Vehicle");
	}
}
class Bike extends Vehicle
{
	@Override
	void engine()
	{
		System.out.println("This is a engine of Bike");
	}
}
class Car extends Vehicle
{
	@Override
	void engine()
	{
		System.out.println("This engine is for Cars");
	}
}

public class Override2
{	
	public static void main(String args[])
	{
		Car c=new Car();
		Bike b=new Bike();
		b.engine();
		c.engine();
	}
}