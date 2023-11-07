class Rectangle1
{
	double length;
	double breadth;
	
	Rectangle1
	{
		length=15.5;
		breadth=16.67;
	}
	void calculateArea()
	{
		System.out.print(length*breadth);
	}
}

class Rectangle_Main
{
	public static void main(String args[])
	{
		double area;
		Rectangle myrec=new Rectangle();
		myrec.calculateArea();
		System.out.println("The area of Rectangle is : "+area);
	}
}