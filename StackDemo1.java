import java.util.Scanner;

class StackDemo1
{
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Ashish");
		stack.push("Sumit");
		stack.push("Amit");
		stack.push("Anissha");
		stack.push("Fatima");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}