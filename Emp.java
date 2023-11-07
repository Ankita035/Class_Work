// Create a package Emp Details. Create a class Emp which has fields as Emp Id, Emp Name, Emp Designation. Accept details from user and display the same.

package EmpMain;

import java.util.Scanner;

public class Emp 
{
	public int empId;
    	public String empName;
    	public String empDesignation;

    	public Emp(int empId, String empName, String empDesignation) 
	{
        	empId = empId;
        	empName = empName;
        	empDesignation = empDesignation;
    	}

    	public void display() 
	{
        	System.out.println("Employee ID		: " +empId);
        	System.out.println("Employee Name	: " +empName);
        	System.out.println("Employee Designation: " +empDesignation);
    	}
}