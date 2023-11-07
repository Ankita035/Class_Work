//Understanding static and non static methods

class SDemo
{
	int res;
	public void add(int a, int b)
	{
		res=a+b;
		System.out.println("The addition is "+res);
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
	double div(int a,int b)
	{
		return (a/b);
	}
}

public class StaticTest
{
	public static void main(String args[])
	{
		SDemo obj=new SDemo();
		obj.add(3,8);
		System.out.println("The Multiplication is "+SDemo.multiply(6,5));
		System.out.println("The Divison is "+obj.div(15,5));
	}
}