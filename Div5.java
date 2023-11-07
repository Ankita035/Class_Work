import java.util.Scanner;								 

class Div5
{
	public static void main(String args[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		num=sc.nextInt();

		if(num%5==0 && num%3==0)
		{
			System.out.println("Entered number is Divisible by 5 and 3");
		}
		else if(num%5==0 || num%3==0)
		{
			System.out.println("Entered number is Divisible by either of 5 or 3");
		}
		else
		{
			System.out.println("Entered number is Not Divisible by 5 and 3");
		}
		sc.close();
	}
}