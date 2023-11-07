/*	Pattern 5

	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	16 17 18 19 20 21
	
*/
class Pattern5
{
	public static void main(String args[])
	{
		int i,j,k=1;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.print(k+" ");
				k++;
			}
		System.out.println();
		}
	}
}