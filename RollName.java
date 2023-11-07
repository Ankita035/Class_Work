// Student class with private fields : roll no, name, age, address and public getter and setters 

package javabean;

import java.io.Serializable;

public class RollName implements Serializable
{
	private int roll_no;
	private String name;
	private int age;
	private String address;
	public RollName()
	{
	}
	public void setRoll_no(int roll_no)
	{
		this.roll_no = roll_no;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
	
}