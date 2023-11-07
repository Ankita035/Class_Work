import java.util.Scanner;

class Percentage
{
	public static void main(String args[])
	{
		int per;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Percentage : ");
		per=sc.nextInt();
		if(per>=75 && per<=100)
		{
			System.out.print("You have scored Distinction");
		}
		else if(per<75 && per>60)
		{
			System.out.println("You have scored First Class");
		}
		else if(per<60 && per>45)
		{
			System.out.println("You have scored Second Class");
		}
		else if(per<45 && per>=35)
		{
			System.out.println("You have just Passed the examination");
		}
		else
		{
			System.out.println("You hava Failed");
		}
	}
}