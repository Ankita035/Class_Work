import java.util.Scanner;								 

class Div5_11
{
	public static void main(String args[])
	{	
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		num=sc.nextInt();

		if(num%5==0 && num%11==0)
		{
			System.out.println("Entered number is Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Entered number is Not Divisible");
		}
		sc.close();
	}
}