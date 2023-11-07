/* "Amar" is HDFC bank customer his Balance is 25000. After sometime, He transferred 11000 amount to his friend "Surya". Print the current balance and find interest value on that amount with interest value 2% and 12 months?	*/

import java.util.Scanner;

public class CalcInterest
{
	public static void main(String args[])
	{
		double bal=25000,amttransferred,rate=2,time=1,Total;
		System.out.println("Amar has the Current Balance + "+bal);
		amttransferred=bal-11000;
		System.out.println("After Transferring Rs.11000, the remaining amount is = "+amttransferred);

		Total=(amttransferred*rate*time)/100;
		System.out.println("The Amount of Interest generated after 12 months is : "+Total);
	}
}