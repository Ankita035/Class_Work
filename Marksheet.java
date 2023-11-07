/*WAP to generate Marksheet of a student based on his personal details and secured marks. Create Personal Info class for accepting student personal information and create another class MarksInfo for accepting students marks details and finally create Result class to display all above class information using multilevel Inheritance.	*/

import java.util.Scanner;

class Base
{
	protected Scanner sc=new Scanner(System.in);
	String Name;
	int roll_num,maths,sci,eng,his,geo;
	double per,total_Marks;

	public void base1()
	{
		System.out.println("Enter the Details :");
	}
}

class PersonalInfo extends Base
{
	public void acceptInfo()
	{
		System.out.print("Enter Student Name: ");
		Name=sc.next();

		System.out.print("Enter your Roll Name: ");
		roll_num=sc.nextInt();
	}
}

class MarksInfo extends PersonalInfo
{
	public void acceptMarks()
	{
		System.out.println("Enter Marks");
		System.out.println("\nEnter your Maths Marks: ");
		maths=sc.nextInt();
		System.out.println("\nEnter your Science Marks: ");
		sci=sc.nextInt();
		System.out.println("\nEnter your English Marks: ");
		eng=sc.nextInt();
		System.out.println("\nEnter your History Marks: ");
		his=sc.nextInt();
		System.out.println("\nEnter your Geography Marks: ");
		geo=sc.nextInt();
	}

	public void calculate()
	{
		total_Marks=maths+sci+eng+his+geo;
		per=(total_Marks/500)*100;
	}
}

class Result extends MarksInfo
{
	public void result1()
	{
		System.out.println("        MarkSheet");
		System.out.println("Roll Number : "+roll_num);
		System.out.println("Name        : "+Name);
		System.out.println("_________________________________");
		System.out.println("Maths       : "+maths);
		System.out.println("Science     : "+sci);
		System.out.println("English     : "+eng);
		System.out.println("History     : "+his);
		System.out.println("Geography   : "+geo);
		System.out.println("_________________________________");
		System.out.println("Total       : "+total_Marks);
		System.out.println("_________________________________");
		System.out.println("Percentage  : "+per);
	}
}

public class Marksheet
{
	public static void main(String args[])
	{
		Result rs=new Result();
		rs.base1();
		rs.acceptInfo();
		rs.acceptMarks();
		rs.calculate();
		rs.result1();
	}
}