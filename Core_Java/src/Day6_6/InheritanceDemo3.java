package Day6_6;

/*** super class member instance field access in child class using super keyword  ***/

class Demo1
{
	int n;
	public Demo1()
	{
		n=10;
	}
}

class Demo2 extends Demo1
{
	int n;
	public Demo2()
	{
		n=20;
		
	}
	public void display()
	{
		int n=30;
		System.out.println("The Local variable field of n: "+n);
		System.out.println("The Local Instance Method : "+this.n);
		System.out.println("The super instance field of n2: "+super.n);
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		d1.display();
		

	}

}
