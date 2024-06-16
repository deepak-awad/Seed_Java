package Day6_6_HomeWork;

/*** Home work Work ***/

public class Item {
	
	private String title,publisher;
	private int yearPublisher, ISBN;
	private float price;
	
	public 	Item()
	{
		title ="Book Item";
		publisher="Deepak Awad";
		yearPublisher = 2015;
		ISBN =123456789;
		price = 2500;
	}
	public Item(String t, String p, int yp, int in, float pr)
	{
		this.title = t;
		this.publisher = p;
		this.yearPublisher = yp;
		this.ISBN = in;
		this.price = pr;
	}
	
	public String toString()
	{
		return "Title: "+title+" Publisher Name: "+publisher+" Year Publisher: "+yearPublisher+" ISBN: "+ISBN+" Price: "+price;
	}
}
	
	class Book extends Item
	{
		private String author;
		private int edition,volume;
		
		public Book()
		{
			author = "Janabai Awad";
			edition = 2;
			volume=29;
		}
		public Book(String t, String p, int yp, int in, float pr, String a,int e,int v)
		{
			super(t,p,yp,in,pr);
			this.author=a;
			this.edition=e;
			this.volume =v;
		}
		public String toString()
		{
			return super.toString()+" Author is: "+author+" Edition is: "+edition+"Volume : "+volume;
		}
	}
	
	class Music extends Item
	{
		private String artist;
		private int volume1;
		
		public Music()
		{
			artist = "Yogesh Chavan";
			volume1=36;
		}
		public Music(String t, String p, int yp, int in, float pr, String at,int v1)
		{
			super(t,p,yp,in,pr);
			this.artist=at;
			this.volume1 =v1;
		}
		public String toString()
		{
			return super.toString()+" Artist is: "+artist+"Volume is : "+volume1;
		}
	}
	
	class Software extends Item
	{
		private float version;
		
		public Software()
		{
			version=(float) 2.93;
		}
		public Software(String t, String p, int yp, int in, float pr, float v2)
		{
			super(t,p,yp,in,pr);
			this.version= v2;
		}
		public String toString()
		{
			return super.toString()+"Version is : "+version;
		}
	}
	
	
	
