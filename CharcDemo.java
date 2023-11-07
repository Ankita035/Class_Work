import java.util.*;

public class CharcDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a set of Characters without any space");
		String input = sc.nextLine();
	
		char[] charArr = input.toCharArray();
		int sum=0;
		for(int i = 0;i<charArr.length; i++)
		{
			sum=(int)(charArr[i])+sum;
		}
		System.out.println("Sum of ASCII code of that All characters :"+ sum);
	}
}