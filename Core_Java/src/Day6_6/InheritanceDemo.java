package Day6_6;

/*** //super class member constructor access in child class using super keyword ***/

class Demo6
{
   int x;
   public Demo6() 
   {
     x=10;
   }
   Demo6(int x)
   {
	   this.x=x;
   }
   public void displayX()
   {
	   System.out.println("x:"+x);
   }
}
class Demo7 extends Demo6
{
   int y;
   public Demo7() 
   {
     super(50);
     y=20;
   }
   Demo7(int y)
   {
	  this.y=y;
   }
   public void displayY()
   {
	   System.out.println("y:"+y);
   }
}

public class InheritanceDemo {
	
	public static void main(String[] args) 
	 {
		 
		 Demo7 ob= new Demo7();  // ob[y=20 | x=10]
		 ob.displayX();
		 ob.displayY();

	 }
}
