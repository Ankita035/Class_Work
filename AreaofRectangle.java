import java.util.Scanner;

class AreaofRectangle
{
	//program to get area of Rectangle
	public static void main(String args[])
	{
		int length,breadth,res;  //declaration of variables
		Scanner sc=new Scanner(System.in);

		System.out.println("The Area of Rectangle :");
		length=sc.nextInt();
		breadth=sc.nextInt();

		res=length*breadth;
		System.out.println("The Area of Rectangle is"+res);
	}
}
