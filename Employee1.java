package javabean;

import java.io.Serializable;

public class Employee1 implements Serializable
{
	private int id;
	private String name;
	public Employee1()
	{
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}