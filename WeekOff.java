/*	It is used for Menu Driven Programming.

switch(ch)
{
	case1:
		code body;
		break;
	case2:
		code body;
		break;
	case3:
		code body;
		break;
	...
	default:
		code body;
		break;
}		*/
	
import java.util.Scanner;

public class WeekOff
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 to select your Weekoff");
		ch=sc.nextInt();

		switch(ch)
		{
			case1:
				System.out.println("Your WeekOff is on MONDAY!!!!!");
				break;
			case2:
				System.out.println("Your WeekOff is on TUESDAY!!!!!");
				break;
			case3:
				System.out.println("Your WeekOff is on WEDNESDAY!!!!!");
				break;
			case4:
				System.out.println("Your WeekOff is on THURSDAY!!!!!");
				break;
			case5:
				System.out.println("Your WeekOff is on FRIDAY!!!!!");
				break;
			case6:
				System.out.println("Your WeekOff is on SATURDAY!!!!!");
				break;
			case7:
				System.out.println("Your WeekOff is on SUNDAY!!!!!");
				break;
			default:
				System.out.println("NO WEEKOFF TO YOU AS AN INVALID INPUT");
				break;
		}
	}
}