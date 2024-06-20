package DayN11_11;

/*** Clonable Concept  ***/

public class Clonable implements Cloneable {
	
	int x;
	int y;
	
	public Clonable()
	{
		x=0;
		y=0;
		
	}
	public Clonable(int x,int y)
	{
		this.x =x;
		this.y =y;
	}
	public String toString()
	{
		return "x:"+x+"y:"+y;
	}
	/*  @Override
	  protected Demo clone() throws CloneNotSupportedException 
	  {
		Demo d= new Demo();
		d.x=this.x;
		d.y=this.y;
		return d;
	  }*/
	  @Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
		return super.clone();
	  }
}
