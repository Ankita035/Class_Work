public class AreaCalculator 
{
	int calculateArea(int length, int width) 
	{
        	return length * width;
	}

   	double calculateArea(double side) 
	{
        	return side * side;
    	}

    	double calculateArea(int radius)
        {
            return 3.14 * radius * radius;
        }

	public static void main(String[] args) 
	{
        	AreaCalculator calculator = new AreaCalculator();

        	System.out.println("Area of Rectangle: " +calculator.calculateArea(10,20));
        	System.out.println("Area of Square: " +calculator.calculateArea(3.1));
       		System.out.println("Area of Circle: " +calculator.calculateArea(10));
    	}
}



