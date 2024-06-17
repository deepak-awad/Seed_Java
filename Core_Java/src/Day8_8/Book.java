package Day8_8;

/***  Sharpen your pencil Class Work ***/

public class Book extends Item 
{
	private String author;
	private int edition,volume;
	
	public Book()
	{
		author = null;
		edition =0 ;
		volume=0;
	}
	public Book(String t, String p, int yp, int in, float pr, String a,int e,int v)
	{
		super(t,p,yp,in,pr);
		this.author=a;
		this.edition=e;
		this.volume =v;
	}
	
	@Override
	public void display()
	{
		System.out.println("Title: "+super.toString());
		System.out.println(" Author is: "+ author);
		System.out.println("Edition is: "+edition);
		System.out.println("Volume : "+volume);
	}
	public String toString()
	{
		return super.toString()+" \nAuthor is: "+author+"\n Edition is: "+edition+"\nVolume : "+volume;
	}
}

