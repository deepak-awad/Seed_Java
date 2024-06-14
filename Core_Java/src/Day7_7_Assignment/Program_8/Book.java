package Day7_7_Assignment.Program_8;
import java.util.Scanner;

/*** ABC Library wants to store details of books. The back-end employee has all rights to:
1  Add a new book
2  Search for any book
3  Display the book details
Class Book should have private data members – isbnNo(int), bookName(String), author((String). Write appropriate constructors, getters and setters.
Create an array of 10 to store books. Add 5 books in the array.        
Accept name of a book from the user. Search it in the array. If found, print the details. If not found, display appropriate message.
Show details of all books.  ***/

public class Book {
	
	int isbnNo;
	String book_name;
	String author;
	
	public Book()
	{
		isbnNo = 0;
		book_name = null;
		author = null;
	}
	public Book(int id, String name, String author)
	{
		this.isbnNo = id;
		this.book_name =name;
		this.author = author;
	}
	
	public void setIsbnno(int no)
	{
		isbnNo = no;
	}
	public void setName(String name)
	{
		book_name = name;
	}
	public void setAuthor(String authorn )
	{
		author = authorn;
	}
	public int getIsbnno()
	{
		 return isbnNo;
	}
	public String getName()
	{
		return book_name;
	}
	public String getAuthor()
	{
		return author;
	}
	
	 public void display()
	 {
		    System.out.println("Isbn No:"+isbnNo);
			System.out.println("Book Name:"+book_name);
			System.out.println("Author Name:"+author); 
	 }
	
	public static void main(String[] args) {
		
		int choice =0;
		Scanner sc = new Scanner(System.in);
		Book book[] = new Book[10];
		
		do
		{
			System.out.println(" 1)Add a new book\n"
			          +" 2)Search for any book\n"
			          + "3)Display the book details");
	        System.out.println("Enter your choice:");
	        choice = sc.nextInt();
	        
	        switch(choice)
	        {
	        case 1:
	        	System.out.println("Enter number of books to add");
	        	Scanner sc1 = new Scanner(System.in);
	        	int check =  sc1.nextInt();
	        	for(int i =0; i< check; i++)
	        	{
	        		
	        		System.out.println("Enter book details:");
	        		 System.out.print("ISBN: ");
	        		 Scanner sc2 = new Scanner(System.in);
	        		 int isbn = sc2.nextInt();
	        		 
	                 System.out.print("Book Name: ");
	                 Scanner sc3 = new Scanner(System.in);
	        		 String name = sc3.next();
	   
	                 System.out.print("Author: ");
	                 Scanner sc4 = new Scanner(System.in);
	        		 String author = sc4.next();
	        		
	        		book[i] =  new Book(isbn, name, author);
	        	}
	        	
	        	break;
	        	
	        case 2:
	        	System.out.println("Enter your book name:");
	        	Scanner sc6 = new Scanner(System.in);
	        	String name =sc6.next();
	        	
	        	for(Book b : book)
	        	{
	        		if(b != null && b.getName().equals(name))
	        		{
	        			System.out.println("Book Found");
	        			break;
	        		}else
	        		{
	        			System.out.println("Book Not Found");
	        			break;
	        		}
	        	}
	        	
	        	
	        case 3:
	        	System.out.println("Book Details are:");
	        	for(Book b1 : book)
	        	{
	        		if (b1 == null) {
	        			System.out.println("Book are not available");
	                    break;
	                }else
	                {
	                	   System.out.println("ISBN: " + b1.getIsbnno());
		                    System.out.println("Book Name: " + b1.getName());
		                    System.out.println("Author: " + b1.getAuthor());
		                    System.out.println();
		                    break;
	                }
	        	}
	        	
	        	default:
	        		System.out.println("Invalid Choice");
	        		break;
	        
	        }
		}while(choice !=0);
		
	}

}
