import java.util.*;

public class Simple3
{
	public static void main(String args[])
	{
	/* StringTokenizer object */
		StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day","  ");
	/* Prints the number of tokens present in the string */
		System.out.println("Total number of Tokens: "+st.countTokens());
	}
}