package EmployalibilityLab.ProblemN11;

public class BusTicket 

{

  private int ticketNo;

  private float ticketPrice;

  private float totalAmount;

  private Person per; // has-a

  public BusTicket() 

  {

	super();

  }

  public BusTicket(int ticketNo, float ticketPrice, Person per) 

  {

	super();

	this.ticketNo = ticketNo;

	this.ticketPrice = ticketPrice;

	this.totalAmount = 0.0f;

	this.per = per;   

  }

public int getTicketNo() 

  {

	return ticketNo;

  }

  public void setTicketNo(int ticketNo) 

  {

	this.ticketNo = ticketNo;

  }

  public float getTicketPrice() 

  {

	return ticketPrice;

  }

  public void setTicketPrice(float ticketPrice) 

  {

	this.ticketPrice = ticketPrice;

  }

  public float getTotalAmount() 

  {

	return totalAmount;

  }

  public void setTotalAmount(float totalAmount) 

  {

	this.totalAmount = totalAmount;

  }

  public Person getPer() 

  {

	return per;

  }

  public void setPer(Person per) 

  {

	this.per = per;

  }

  @Override

  public String toString() 

  {

	return "BusTicket [ticketNo=" + ticketNo + ", ticketPrice=" + ticketPrice + ", totalAmount=" + totalAmount

			+ ", per=" + per + "]"; 

  }

  public float calculateTotal()

  {

	  if(per.getAge()<16)

	  {

		  this.totalAmount=this.ticketPrice-(this.ticketPrice*50.0f/100.0f);

	  }

	  if(per.getAge()>=60)

	  {

		  this.totalAmount=this.ticketPrice-(this.ticketPrice*25.0f/100.0f);

	  }

	  if(per.getGender()=='f')

	  {

		  this.totalAmount=this.ticketPrice-(this.ticketPrice*10.0f/100.0f);

	  }

     return this.totalAmount; 

  }

  public void display()

  {

	  this.per.display();

	  System.out.println("Ticket No:"+ticketNo);

	  System.out.println("Ticket price:"+ticketPrice);

	  System.out.println("Total Amount:"+totalAmount);

  }

}
