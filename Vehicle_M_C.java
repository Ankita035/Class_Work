// Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". Create two subclasses "Car" and "Motorcycle" that extends the "Vehicle" class and implement the abstract methods. Write a Java program to demonstrate starting stopping operations from a car and a motorcycle.

abstract class Vehicle 						//creating an abstract class called "Vehicle"
{
	abstract void start();
	abstract void stop();					//creating abstract methods
}

class Car extends Vehicle 					//creating subclass Car that extends Vehicle class
{
	@Override
	void start() 
	{
		System.out.println("Car is starting...");
	}

	@Override
	void stop() 
	{
		System.out.println("Car is stopping...");
	}
}

class Motorcycle extends Vehicle 				//creating subclass Motorcycle that extends Vehicle class
{
	@Override
	void start() 
	{
		System.out.println("Motorcycle is starting...");
	}
	@Override
	void stop() 
	{
	System.out.println("Motorcycle is stopping...");
	}
}

public class Vehicle_M_C					//main method to execute the starting and stopping of tha Car and Motorcycle
{
	public static void main(String[] args) 
	{
		Car c=new Car();	
		Motorcycle m=new Motorcycle();
								//displaying the operation of the Car and Motorcycle
		System.out.println("Starting of the Car:");
		c.start();
		System.out.println();
		System.out.println("Stopping of the Car:");
		c.stop();
		System.out.println("---------------------------------------");

		System.out.println("Starting of the Motorcycle:");
		m.start();
		System.out.println();
		System.out.println("Stopping of the Motorcycle:");
		m.stop();
	}
}