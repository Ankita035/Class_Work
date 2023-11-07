import java.util.Scanner;

public class Calculator
{
	public static void main(String args[])
	{
		double num1,num2,sum;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 for Addition, 2 for Substraction,3 for Multiplication,4 for Division");
		ch=sc.nextInt();

		switch(ch)
		{
			case 1:
				System.out.println("Enter number 1:");
				num1=sc.nextDouble();
				System.out.println("Enter number 2:");
				num2=sc.nextDouble();
				sum=num1+num2;
				System.out.println("The Addition of numbers is: "+sum);
				break;
			case 2:
				System.out.println("Enter number 1:");
				num1=sc.nextDouble();
				System.out.println("Enter number 2:");
				num2=sc.nextDouble();
				sum=num1-num2;
				System.out.println("The Substraction of numbers is: "+sum);
				break;
			case 3:
				System.out.println("Enter number 1:");
				num1=sc.nextDouble();
				System.out.println("Enter number 2:");
				num2=sc.nextDouble();
				sum=num1*num2;
				System.out.println("The Multipication of numbers is: "+sum);
				break;
			case 4:
				System.out.println("Enter number 1:");
				num1=sc.nextDouble();
				System.out.println("Enter number 2:");
				num2=sc.nextDouble();
				sum=num1/num2;
				System.out.println("The Division of numbers is: "+sum);
				break;
			default:
				System.out.println("INVALID INPUT");
				break;
		}
	}
}