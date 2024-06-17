package Day8_8;

/***  Sharpen your pencil Class Work ***/

public class Item {
	
	String title, publisher;
	int yearPublisher,ISBN ;
	float price;
	
	public Item()
	{
		title= null;
		publisher = null;
		yearPublisher = 0;
		ISBN =0;
		price= 0.0f;
		
	}
	public Item(String title, String publisher, int year, int isbn, float price )
	{
		this.title = title;
		this.publisher = publisher;
		this.yearPublisher = year;
		this.ISBN = isbn;
		this.price  = price;
	}
	public void display()
	{
		System.out.println("Title: "+title);
		System.out.println("\n Publisher "+ publisher);
		System.out.println("\nYear Publisher: "+yearPublisher);
		System.out.println("\nIsbn: "+ISBN);
		System.out.println("\nprice: "+price);
	}
	public String toString()
	{
		return "\ntitle:"+title+"\nPublisher"+publisher+"\nYear Publisher:"+yearPublisher+"\nIsbn: "+ISBN+"\nPrice: "+price;
	}
}
