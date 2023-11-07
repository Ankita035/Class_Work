// Write a program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of the rectangle. 

import java.util.Scanner;

class Shape 
{
	void getArea() 
	{
		System.out.print("Enter the Details"); 	
}
class Rectangle extends Shape 
{
	public double width;
	public double height;
	Scanner sc=new Scanner(System.in);
	void getArea()
	{
		System.out.println("Enter height for the rectangle:");
		height=sc.nextDouble();
		System.out.println("Enter width for the rectangle:");
		width=sc.nextDouble();
	}
	void display() 
	{
		double area;
		area=width * height; 						// Calculate area of the rectangle
		System.out.println("The Area of Rectangle is "+area);
	}
}

public class Shape_Rect
{
	public static void main(String args[]) 
	{
										// Creating a Rectangle object
		Rectangle r = new Rectangle();
		r.getArea();								// Displaying the area of the rectangle
		r.display();
	}
}