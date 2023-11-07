public class MethodOverload
{
	int add(int num1, int num2)
	{
		return num1+num2;
	}
	int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	int add(int num1, int num2, int num3, int num4)
	{
		return num1+num2+num3+num4;
	}
	public static void main(String args[])
	{
		MethodOverload obj=new MethodOverload();
						//This will call the first add method
		System.out.println("Sum of Two numbers: "+obj.add(10,20));
						//This will call second add method
		System.out.println("Sum of Three numbers: "+obj.add(10,20,30));
						//This will call third add method
		System.out.println("Sum of Four numbers: "+obj.add(10,20,40,5));
	}
}