import java.util.Scanner;

class Average
{
	//program to calculate Average of three number
	public static void main(String args[])
	{
		double num1,num2,num3,res;  //declaration of variables 
		Scanner sc=new Scanner(System.in);

		System.out.println("To calculate Average :");
		System.out.println("Enter number 1");
		num1=sc.nextDouble();
		System.out.println("Enter number 2");
		num2=sc.nextDouble();
		System.out.println("Enter number 3");
		num3=sc.nextDouble();

		res=(num1+num2+num3)/3;
		System.out.println("Average of the numbers :"+res);
	}
}