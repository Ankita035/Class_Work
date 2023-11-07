import EmpMain.Emp;

import java.util.Scanner;

public class EmpMain
{	
	public static void main(String[] args) 
	{
	        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
        	int empId = scanner.nextInt();
        	scanner.nextLine();
        	System.out.print("Enter Employee Name: ");
	        String empName = scanner.nextLine();
	        System.out.print("Enter Employee Designation: ");
	        String empDesignation = scanner.nextLine();

	        Emp e = new Emp(empId, empName, empDesignation);
        	System.out.println("Employee Details:");
        	e.display();
    }
}