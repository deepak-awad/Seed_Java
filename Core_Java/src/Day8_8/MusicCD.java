package Day8_8;

/***  Sharpen your pencil Class Work ***/

public class MusicCD extends Item{

	String artist;
	 int volume1;
	
	public MusicCD()
	{
		artist = null;
		volume1=0;
	}
	public MusicCD(String t, String p, int yp, int in, float pr, String at,int v1)
	{
		super(t,p,yp,in,pr);
		this.artist=at;
		this.volume1 =v1;
	}
	@Override
	public void display()
	{
		System.out.println("Title: "+super.toString());
		System.out.println("Artist is:"+ artist);
		System.out.println("Volume is :: "+volume1);
	}
	public String toString()
	{
		return super.toString()+" Artist is: "+artist+"Volume is : "+volume1;
	}
}
