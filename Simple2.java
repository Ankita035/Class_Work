import java.util.*;

public class Simple2
{
	public static void main(String args[])
	{
		StringTokenizer st= new StringTokenizer("My,Name,Is,Ankita",",");

		System.out.println("The next token is : ");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}