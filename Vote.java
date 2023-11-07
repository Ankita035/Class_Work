import java.util.Scanner;
class Vote
{ 	
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age:");
		a=sc.nextInt();

		if(a>18)
		{	
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	} 
}