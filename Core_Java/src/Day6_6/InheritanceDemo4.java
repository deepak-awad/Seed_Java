package Day6_6;

/***  super class member instance method access in child class using super keyword ***/

class Demo3
{
	int c;
	public Demo3()
	{
		c=10;
	}
}

class Demo4 extends Demo3
{
	int b;
	public Demo4()
	{
		b=5;
	}
	int max()
	{
		if(super.c > b)
		{
			return c;
		}
		return b;
	}
	public void display()
	{
		System.out.println("The value ob c is: "+super.c);
		System.out.println("The value ob b is: "+b);
		System.out.println("The greater number is : "+max());
	}
}

public class InheritanceDemo4 {

	public static void main(String[] args) {
		Demo4 d1 = new Demo4();
		d1.display();
	}
}
