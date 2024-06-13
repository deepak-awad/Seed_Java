package Lab_Manual.Lab_Exercise_N12;

/*** construct hierarchy of employees. Inherit class Manager and MarketingExecutive from base class employee. 
 * Manager class extends Employee    ***/

public class Manager extends Employee{
	
	private double p_allowance, f_allowance, o_allowance;
	
	public Manager( )
	{
		super();
		p_allowance = (super.salary * 8)/ 100;
		f_allowance = (super.salary * 13) /  100;
		o_allowance = (super.salary * 3) / 100;
	}
	public Manager(int id, String name, double sal, double medical)
	{
		super(id, name, sal, medical);
		this.p_allowance = (sal * 8) / 100;
		this.f_allowance = (sal* 13) / 100;
		this.o_allowance = (sal * 3) / 100;
	}
	public String toString() 
	{
		return super.toString()+"\nPetrol Allowance : "+p_allowance+"\nFood Allowance : "+f_allowance+"\nOther Allowance : "+o_allowance;
	}
	
	public static void main(String args[])
	{
		Manager m1 = new Manager();
		System.out.println(""+m1.toString());
		System.out.println();
		
		Manager m2 = new Manager(103, "Test One", 60000, 300);
		System.out.println(""+m2.toString());
		
	}

}
