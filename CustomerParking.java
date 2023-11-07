/* WAP to accept customer details as name, flatno., parking(yes/no). if yes then allocate parking with flat no. and display all customers details. 
Note: The parking lot is paid - Rs.150000/-		*/

import java.util.Scanner;

class Customer 
{
	String name;
	String flatNo;

	public Customer(String name, String flatNo) 
	{
		this.name = name;
		this.flatNo = flatNo;
	}
}

public class CustomerParking 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		Customer[] ct = new Customer[10];
		ct[0] = new Customer("Shivam", "A101");
		ct[1] = new Customer("Akshay", "A102");
		ct[2] = new Customer("Prajwal", "A103");
		ct[3] = new Customer("Sakshi", "B201");
		ct[4] = new Customer("Aarti", "B202");
		ct[5] = new Customer("Maithili", "B203");
		ct[6] = new Customer("Rajkumar", "C301");
		ct[7] = new Customer("Ajay", "C302");
		ct[8] = new Customer("Jasmine", "C303");
		ct[9] = new Customer("Madhura", "C304");

		double parkingFee = 150000; // Parking fee amount
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Flat number:");
		String flatNo = sc.nextLine();
		System.out.println("Do you want Parking?");
		char parking = sc.next().charAt(0);
      
		boolean found = false;
		for (Customer customer : ct) 
		{
			if (customer != null && customer.name.equals(name) && customer.flatNo.equals(flatNo)) 
			{
				found = true;
				if (parking == 'Y' || parking == 'y') 
				{
					System.out.println("Customer name: " + name);
					System.out.println("Flat No: " + flatNo);
					System.out.println("Parking Lot Fees: " + parkingFee);
				} 
				else 
				{
					System.out.println("Customer name: " + name);
					System.out.println("Flat No: " + flatNo);
				}
				break;
			}
		}
	}
}
