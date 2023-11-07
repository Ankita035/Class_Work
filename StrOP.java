// WAP to implement multilevel inheritance to perform different operations in String.

import java.util.*;

class StringOperations
{
	String str1;
	public void display() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for the operations: ");
		str1 = sc.nextLine();
	}
}

class UandLCase extends StringOperations 
{
	
	public void convertToUpper(String str1) 
	{
		System.out.println("The Uppercase of the string is: "+ str1.toUpperCase());
	}
	public void convertToLower(String str1) 
	{
		System.out.println("The Lowercase of the string is: " + str1.toLowerCase());
	}
}

class IndRep extends StringOperations 
{
	public void index(String str1)
	{
		System.out.println("The Index of the First String is: "+str1.indexOf('n'));
	}
	public void replace(String str1)
	{
		String str2;
        	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String to replace with "+str1);
		str2 = sc.nextLine();
	        System.out.println("Replaced: "+str1.replace(str1, str2));
	}
}

public class StrOP
{
	public static void main(String args[]) 
	{
        
		StringOperations so = new StringOperations();
		so.display();

		UandLCase ul = new UandLCase();
		ul.convertToUpper(so.str1);
		ul.convertToLower(so.str1);

		IndRep ir = new IndRep();
		ir.index(so.str1);
		ir.replace(so.str1);
	}
}