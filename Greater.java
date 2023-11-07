import java.util.Scanner;

class Greater
{
	public static void main(String args[])
	{	
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number a");
		a=sc.nextInt();
		System.out.print("Enter number b");
		b=sc.nextInt();

		if(a>b)
		{
			System.out.println(a+"greater than "+b);
		}
		else
		{	
			System.out.println(b+"greater that"+a);
		}
	}	
}