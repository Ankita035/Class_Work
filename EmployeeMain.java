import javabean.Employee1;

public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee1 s = new Employee1();
		s.setName("Chandler");
		System.out.println(s.getName());
		s.setId(50);
		System.out.println("The employee id is: "+s.getId());
	}
}