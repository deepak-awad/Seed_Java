package Day8_8;
import java.util.Scanner;

/***  Sharpen your pencil Class Work with instance of method inheritance  ***/

public class Main {
	
	public static void display(Item e)
	{
		
		if(e instanceof Book)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			((Book)e).display();
		}
		if(e instanceof MusicCD)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
		}
		if( e instanceof Software)
		{
			e.display();
			System.out.println();
			System.out.println(e.toString());
		}	
	}
	

	public static void main(String[] args) {
		int choice=0;
		
		Item e = null;
		
		do 
		{
			System.out.println("1) Book Details"
					+ "\n2) Music Cd Details"
					+ "\n3) Software Deaatils");
			
			System.out.println("Enter your choice: ");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				e= new Book("David ","Deepak",2012,12245,1500.0f,"Drshan",1,15);
				display(e);
				break;
				
			case 2:
				e = new MusicCD("David ","Deepak",2012,12245,1500.0f,"Yash",15);
				display(e);
				
			case 3:
				e = new Software("David ","Deepak",2012,12245,1500.0f,15);
				display(e);
			
				
				default:
					System.out.println("Invalid Choice");
			}
			
		}while(choice >0);
		
	}
}
