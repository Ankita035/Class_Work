import java.util.Scanner;

class EvenOdd
	{
		public static void main(String args[])
		{
			int num;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a Number: ");
			num=sc.nextInt();

			if(num%2==0)		
			{
				System.out.print("The number is Even");
			}
			else
			{
				System.out.print("The number is Odd");
			}
		}
	}