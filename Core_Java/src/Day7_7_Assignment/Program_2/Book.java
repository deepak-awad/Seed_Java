package Day7_7_Assignment.Program_2;
import java.util.*;

/*** Create a class Book containing Book_Id,Book_name, author and Price
   as a member fields and write properties and necessary member methods for the
   following 
   a. To Accept Book Information.
   b. Update book Information by Book_Id.  
   b. Display All book details.
   c. Display book details of a given author.
   d. Display book details of Book_Id.
Use Hints:
- Function Overloading
- Use Array of objects 
- Write Menu Driven Program ***/

public class Book {
	
	int book_id;
	String book_name,author;
	double price;
	
	public Book()
	{
		book_id =0;
		book_name =null;
		author = null;
		price=0.0;
	}
	public Book(int id ,String name,String author, double price)
	{
		this.book_id =id;
		this.book_name = name;
		this.author = author;
		this.price = price;
	}
	public void setId(int id)
	{
		book_id =id;
	}
	public int getId()
	{
		return book_id;
	}
	public void setAuthor(String Author)
	{
		author = Author;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getName()
	{
		return book_name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setName(String name)
	{
		book_name = name;
	}
	public void setPrice(double pri)
	{
		price = pri;
	}
	public void display() {
        System.out.println("Book ID: " + book_id);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author Name: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

	public static void main(String[] args) {
		
		int choice;
		int no =0;
		Scanner sc = new Scanner(System.in);
		
		Book book[] = new Book[100];
		
		
		do
		{
			System.out.println("Menu:");
            System.out.println("1. Accept Book Information");
            System.out.println("2. Update Book Information by Book ID");
            System.out.println("3. Display All Book Details");
            System.out.println("4. Display Book Details of a Given Author");
            System.out.println("5. Display Book Details by Book ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice)
            {
            
            case 1:
            	System.out.println("1. Accept Book Information");
            	System.out.println("Enter number of book to add");
            	Scanner sc1 = new Scanner(System.in);
            	int no1 = sc1.nextInt();
            	
            	for(int i =0;i< no1; i++)
            	{
            		System.out.println("Enter Book id: ");
            		Scanner sc2= new Scanner(System.in);
            		int id = sc2.nextInt();
            		
            		System.out.println("Enter Book name: ");
            		Scanner sc3= new Scanner(System.in);
            		String name = sc3.next();
            		
            		System.out.println("Enter author name: ");
            		Scanner sc5= new Scanner(System.in);
            		String author = sc5.next();
            		
            		System.out.println("Enter Book price: ");
            		Scanner sc4= new Scanner(System.in);
            		double price = sc4.nextInt();
            		
            		book[i] = new Book(id, name,author ,price);
            		
            	}
            	
            	break;
            	
            case 2:
            	  System.out.println("2. Update Book Information by Book ID");
            	  System.out.println("Enter the id to update book details: ");
            	  Scanner sc8 = new Scanner(System.in);
            	  int id = sc8.nextInt();
 
            			for(int i =0; i< book.length;i++)
            			{
            				if(book[i].getId()== id)
            				{
            					System.out.println("Enter Book id: ");
                        		Scanner sc2= new Scanner(System.in);
                        		int id1 = sc2.nextInt();
                        		
                        		System.out.println("Enter Book name: ");
                        		Scanner sc3= new Scanner(System.in);
                        		String name = sc3.next();
                        		
                        		System.out.println("Enter author name: ");
                        		Scanner sc5= new Scanner(System.in);
                        		String author = sc5.next();
                        		
                        		System.out.println("Enter Book price: ");
                        		Scanner sc4= new Scanner(System.in);
                        		double price = sc4.nextInt();
                        		
                        		book[i].setId(id1);
                        		book[i].setName(name);
                        		book[i].setAuthor(author);
                        		book[i].setPrice(price);
                        		System.out.println("Data Updated Successfully");
                        		book[i].display();   
                        		break;
            				}
            			}
            	  
            	break;
            	
            	
            case 3:
            	System.out.println("3. Display All Book Details");
            	System.out.println("All Book Details are:");
            	for(Book b : book)
            	{
            		if( b == null)
            		{
            			System.out.println("Book are not available");
            		}
            		else
            		{
            			b.display();
	                    System.out.println();
	                    break;
            		}
            	}
            	
            	break;
            	
            	
            case 4:
            	 System.out.println(" Display Book Details of a Given Author");
             	System.out.println("Enter the book author: ");
             	Scanner sc7 = new Scanner(System.in);
             	String author = sc7.next();
             	
             	for(Book b1 : book)
             	{
             		if(b1 != null && b1.getAuthor().equals(author) )
             		{
             			System.out.println("Book Found");
             			b1.display();
	        			break;
             		}
             		else
             		{
             			System.out.println("Book not Found");
             			break;
             		}
             	}
             	break;
            	
            case 5:
            	System.out.println("5. Display Book Details by Book ID");
            	System.out.println("Enter the book id: ");
            	Scanner sc6 = new Scanner(System.in);
            	int id4 = sc6.nextInt();
            	
            	for(Book b : book)
            	{
            		if(b != null && b.getId() == id4)
            		{
            			System.out.println("Book Found");
             			b.display();
	        			break;
            		}
            		else
            		{
            			System.out.println("Book not Found");
            			break;
            		}
            	}
            	break;
            	
            	default :
            		System.out.println("Invalid Choice");
            }
			
		}while(choice != 0);
		

	}

}
