import javabean.RollName;

public class RollNameMain
{
	public static void main(String args[])
	{
		RollName s = new RollName();
		s.setName("Ankita");
		System.out.println("Name: "+s.getName());
		s.setRoll_No(15);
		System.out.println("Roll No: "+s.getRoll_No());
		s.setAge(23);
		System.out.println("Age: "+s.getAge());
		s.setAddress("Navi Mumbai");
		System.out.println("Address: "+s.getAddress());
	}
}