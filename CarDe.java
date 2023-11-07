/*WAP to get car details from the user. Here properties to display are brand, model name, top speed and write corresponding getters and setters. Atleast two car details should be visible.	*/

class CarDetail
{
	private String brandname;
	private String modelname;
	private int topspeed;
	
	//setter method
	public void setbrandname(String brandname)
	{
		this.brandname=brandname;
	}
	public void setmodelname(String modelname)
	{
		this.modelname=modelname;
	}
	public void settopspeed(int topspeed)
	{
		this.topspeed=topspeed;
	}

	//getter method
	public String getbrandname()
	{
		return brandname;
	}
	public String getmodelname()
	{
		return modelname;
	}
	public int gettopspeed()
	{
		return topspeed;
	}
}
public class CarDe
{
	public static void main(String args[])
	{
		//1st Car Detail
		//Making the Object
		CarDetail c1 = new CarDetail();
		c1.setbrandname("Ford");
		c1.setmodelname("Mustang");
		c1.settopspeed(165);
		
		System.out.println("Brand name of Car: "+c1.getbrandname());
		System.out.println("Model name of Car: "+c1.getmodelname());
		System.out.println("Top Speed of Car: "+c1.gettopspeed());

		System.out.println("____________________________");
		
		//2nd Car Detail
		//Making Another Object
		CarDetail c2 = new CarDetail();
		c2.setbrandname("Maserati");
		c2.setbrandname("GranCarbrio");
		c2.settopspeed(285);
	
		System.out.println("Brand name of Car: "+c2.getbrandname());
		System.out.println("Model name of Car: "+c2.getmodelname());
		System.out.println("Top Speed of Car: "+c2.gettopspeed());
	}
}