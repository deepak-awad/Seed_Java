package Day5_5;

/*** Array Demo ***/

public class Demo {
	
	int x;
	  public Demo(int x)
	  {
		  this.x=x;
	  }
	  @Override
	  public String toString() 
	  {
		return "x:"+x;
	  }
	  public static void update(Demo d)
	  {
		 d.x+=20;
	  }
	  public static void main(String[] args) 
	  {
		 Demo d1 = new Demo(10);
		 System.out.println("before d1:"+d1);
		 update(d1);
		 System.out.println("after d1:"+d1);
	  }

}
