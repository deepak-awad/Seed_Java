package Day6_6;

/*** Inheritance Problem Demo ***/

class Emp1
{
	int n1=40;
	public Emp1()
	{
		System.out.println("The value of n: "+n1);
		int n =10;
	}
}
class Hr1 extends Emp1
{
	int n2=10;
	public Hr1()
	{
		n2=30;
		System.out.println("The vaue of y:"+n2);
		System.out.println("The vaue of x:"+n1);
		n2=30;
	}
}

public class InheritanceDemo2 {
	
	public static void main(String args[])
	{
	  Hr1 h1 = new Hr1();
	}
}
