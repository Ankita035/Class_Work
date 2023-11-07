class Shape 
{
	double length;
	double breadth;
	double radius;

    	Shape() 
	{
    		this.length = 6.25;
    		this.breadth = 5.22;
    	 	this.radius = 8.55;
    	}
}

class Rectangle extends Shape 
{
	public Rectangle(double length, double breadth) 
	{
        	super(length, breadth, 0); // Radius is set to 0 for rectangles
    	}

    	public double calculateArea() 
	{
        	return length * breadth;
    	}
}

class Circle extends Shape 
{
	public Circle(double radius) 
	{
        	super(0, 0, radius); // Length and breadth are set to 0 for circles
    	}

    	public double calculateArea() 
	{
        	return 3.14*radius*radius;
    	}
}

public class Shape_Main 
{
	public static void main(String[] args) 
	{
        	Rectangle rectangle = new Rectangle();
        	double rectangleArea = rectangle.calculateArea();
        	System.out.println("The Area of Rectangle is : " + rectangleArea);

        	Circle circle = new Circle();
        	double circleArea = circle.calculateArea();
        	System.out.println("The Area of Circle is : " + circleArea);
    	}
}