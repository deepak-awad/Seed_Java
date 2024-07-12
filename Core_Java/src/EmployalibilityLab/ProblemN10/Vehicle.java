package EmployalibilityLab.ProblemN10;

public class Vehicle implements Loan,Insurance {
	
	private int vehicleNo;
	private String Modelname;
	private String VehicleType;
	private double price;
	
	public Vehicle(int no, String modelname, String type, double price)
	{
		this.vehicleNo = no;
		this.Modelname = modelname;
		this.VehicleType = type;
		this.price = price;
	}
	
	public double issueLoan()
	{
		
		if(VehicleType.equalsIgnoreCase("4Wheeler"))
		{
			System.out.println("Eligible loan amount is 75% of price");
			
		}else if(VehicleType.equalsIgnoreCase("3Wheeler"))
		{
			System.out.println("Eligible loan amount is 70% of price");
			
		}else if(VehicleType.equalsIgnoreCase("2Wheeler"))
		{
			System.out.println("Eligible loan amount is 60% of price");
			
		}else
		{
			System.out.println("You are not eligible");
		}
		return 0;
		
	}
	public double takeInsurance()
	{
		if(price <= 150000 )
		{
			System.out.println("Insurance amount is 4000");
		}else if(price >= 150000 && price <= 300000)
		{
			System.out.println("Insurance amount is 4500");
		}else if(price > 300000 )
		{
			System.out.println("Insurance amount is 6000");
		}else
		{
			System.out.println("You are not take insurance");
		}
		return price;
		
	}

}
