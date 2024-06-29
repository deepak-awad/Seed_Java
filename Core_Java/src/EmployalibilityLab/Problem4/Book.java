package EmployalibilityLab.Problem4;

public class Book implements Comparable<Book> {
	
	String bookname;
	int bookprice;
	String bookauthor;
	
	public Book(String bname, int bprice, String bau)
	{
		this.bookname = bname;
		this.bookprice = bprice;
		this.bookauthor = bau;
	}
	public void setName(String name)
	{
		this.bookname = name;
	}
	public String getName()
	{
		return bookname;
	}
	public void setBprice(int price)
	{
		this.bookprice = price;
	}
	public int getPrice()
	{
		return bookprice;
	}
	public void setAuthor(String author)
	{
		this.bookauthor = author;
	}
	public String getAuthor()
	{
		return bookauthor;
	}
	public String toString()
	{
		return "Book name is: "+bookname+"\nBook price is: "+bookprice+"\nBook Author is: "+bookauthor;
	}
	
	public int compareTo(Book a)
	{
		String name1 =this.bookname;
	    String name2 =a.bookname;
		return (name1.compareTo(name2));
	}
	

}
