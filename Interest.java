import java.util.Scanner;

class Interest
{
	//program to calculate Simple Interest
	public static void main(String args[])
	{
		double p,t,r,SI;  //declaration of variables p=Principle amount,t=time span,r=rate of interest,SI=Simple Interest
		Scanner sc=new Scanner(System.in);
		System.out.println("To calculate Simple Interest :");

		System.out.println("Enter principle amount:");
		p=sc.nextDouble();
		System.out.println("Enter time span:");
		t=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		r=sc.nextDouble();

		SI=(p*t*r)/100;
		System.out.println("The Simple Interest is"+SI);
	}
}