package vehicles;
public class Cars implements Vehicle
{
	public void run()
	{
		System.out.println("Car is running");
	}
	public void speed()
	{
		System.out.println("Speed of Car is 50 Km/h");
	}
	public static void main(String args[])
	{
		Cars r=new Cars();
		r.run();
		r.speed();
		System.out.println("Hello World");
	}
}