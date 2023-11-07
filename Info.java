class Info
{
	String name;
	String address;
	int age;
	void tellName(){ };
	void tellAddress(){ };
	void tellAge(){ };
	public static void main(String agrs[])
	{
		Info obj = new Info();
		obj.name= "Ankita";
		obj.address = "Navi Mumbai, Maharastra, India";
		obj.age = 23;
		System.out.println("Name of the girl is: "+obj.name);
		System.out.println("Address of the girl is: "+obj.address);
		System.out.println("Age of the girl is: "+obj.age);
	}
}