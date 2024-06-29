package EmployalibilityLab.Problem5;

public class Ticket {
	
	private int ticketid;
	private int price;
	static int availableTickets;
	
	static
	{
		availableTickets =10; 
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setTicket(int id)
	{
		this.ticketid = id;
	}
	public int getTicket()
	{
		return ticketid;
	}
	public int calculateTotalCost(int nooftickets,int price)
	{
		int cost =price * nooftickets;
		System.out.println("The total cost of ticket is:"+cost);
		return 0;
	}

}
