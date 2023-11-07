//ToString()

class Employee
{
	int empcode;
	String name;
	String city;
	Student(int empcode, String name, String city)
	{
		this.empcode=empcode;
		this.name=name;
		this.city=city;
	}
	public String toString()
	return empcode+" "+name+" "+city;
}
public static void main(String args[])
{
	Employee e1=new Employee(350,"Rohan","Kolkata");
	Employee e2=new Employee(351,"Priya","Noida");
	System.out.println(e1);
	System.out.println(e2);
}
