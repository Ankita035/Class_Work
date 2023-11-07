/* To accept Salary from user and make decision as per given condition:
sal>=50000  print "I am happy"
sal>=75000 print"I have a better life"
sal>=100000 print"My family is happy with me"		*/


import java.util.Scanner; 							// import scanner class

class Sal   								       	// 
{
	public static void main(String args[]) 					// main entry method
	{
		int Sal;   							// declaration of variables
		Scanner sc=new Scanner(System.in);  				// created scanner class
		System.out.println("Enter your Salary");			// printing  the message
		Sal=sc.nextInt();						// input from user 
		
		if(Sal>=50000 && Sal<75000)					// AND condition used  
		{
			System.out.println("I am happy");			// print the message
		}
		else if(Sal>=75000 && Sal<100000)				// condition
		{
			System.out.println("I have better life");		// Printing the message
		}
		else if(Sal>=100000)						// condition
		{
			System.out.println("My family is happy with me");	// Printing the message
		}
		else
		{
			System.out.println("I am not Satisfied");		// Printing the message
		}
		sc.close();							// Scanner class closed
	}
}