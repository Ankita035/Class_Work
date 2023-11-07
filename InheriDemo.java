import java.util.Scanner;

class Base
{
	int a,b,sum;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter First number");
		a=sc.nextInt();
		System.out.println("Enter Second number");
		b=sc.nextInt();
	}
}
class Derived extends Base
{
	public void display()
	{
		sum=a+b;
		System.out.println("The Addition is : "+sum);
	}
}
public class InheriDemo
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.accept();
		d.display();
	}
}