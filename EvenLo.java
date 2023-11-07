// WAP to print even numbers from 1 to 200

class EvenLo
{
	public static void main(String args[])
	{
		int i;
		System.out.println("The Even numbers are : ");
		for(i=1;i<=200;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}