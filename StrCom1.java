/* If the first string is lexicographically greater that the second string, it returns a positive number(difference of character value).
If the first string is less than the second string lexicographically, it returns a negative number and If the first string is lexicographically equal to the second string, it returns 0.
*/

public class StrCom1
{
	public static void main(String args[])
	{
		String str1="India";
		String str2="Goa";
		int i=str1.compareTo(str2);
		System.out.println(i);
		String str3=str1.toLowerCase();
		System.out.println(str3);
	}
}