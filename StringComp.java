import java.util.Scanner;

public class StringComp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings for comparision: ");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int i = str1.compareTo(str2);
		
		if(i==0)
		{
			System.out.println("Both the Strings are equal");
		}
		else
		{
			System.out.println("Both the Strings are not Equal");
		}
	}
}