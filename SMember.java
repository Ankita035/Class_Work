public class SMember
{
	static int roll_no;
					//static variable
	static long age;
					//static method
	static void display()
	{
		System.out.println("Static Method");
	}
	public static void main(String args[])
	{
					//access the static variable					age = 23;
		roll_no = 14;
		System.out.println("Age is "+ age);
		System.out.println("Age is "+ SMember.age);
		System.out.println("Roll No: "+ SMember.roll_no);
					//access the static method
		display();
	}
}