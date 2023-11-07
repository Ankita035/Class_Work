import java.util.Scanner;

class SimpleInterest
{
	//program to calculate Simple Interest
	public static void main(String args[])
	{
		int p,t,r,SI;  //declaration of variables p=Principle amount,t=time span,r=rate of interest,SI=Simple Interest
		Scanner sc=new Scanner(System.in);

		System.out.println("To calculate Simple Interest :");
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();

		SI=(p*t*r)/100;
		System.out.println("The Simple Interest is"+SI);
	}
}
