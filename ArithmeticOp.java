import java.util.Scanner;

class ArithmeticOp
{
	//program to demonstrate use of arithmetic operators.
	public static void main(String args[])
	{
		int num1,num2,res; //declaration of variables
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();

		res=num1+num2*;
		System.out.println("The addition is"+res);
		
		res=num1-num2;
		System.out.println("The substration is"+res);

		res=num1*num2;
		System.out.println("The multiplication is"+res);

		res=num1/num2;
		System.out.println("The division is"+res);

		res=num1%num2;
		System.out.println("The reminder is"+res);
	}
}