public class TestFinallyBlock
{
	public static void main(String args[])
	{
		try
		{
								//below code throws divide by zero exception
			System.out.println("Inside the Try Block");
			int data=25/0;
			System.out.println(data);
		}
								//cannot handle Arithmetic type exception
								//can only accept Null Pointer type exception
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
								//executed regardless of exception occured or not
		finally
		{
			System.out.println("Finally block is always executed");
			System.out.println("This is compulasory executed block irrespective of Exception");
		}
		System.out.println("Remaining code block......");
	}
}