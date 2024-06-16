package Day6_6_HomeWork;

/*** Home work Work ***/

public class BookMain {
	
	public static void main(String args[])
	{
		Book b1 = new Book();
		System.out.println(b1);
		
		Book b2 = new Book("New Item","Ashwini Awad",2019,987456321,9600,"Niteen John",5,30);
		System.out.println(b2);
		
		Music m1 = new Music();
		System.out.println(m1);
		
		Music m2 = new Music("New Item","Ashwini Awad",2019,987456321,9600,"Testing a ",30);
		System.out.println(m2);
		
		Software s1 = new Software();
		System.out.println(s1);
		
		Software s2 = new Software("New Item","Ashwini Awad",2019,987456321,9600,20);
		System.out.println(s2);
	}
	

}
