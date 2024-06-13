package Lab_Manual.Lab_Exercise_N12;

/*** construct hierarchy of employees. Inherit class Manager and MarketingExecutive from base class employee. 
 * MarketingExecutive class extends Employee    ***/

public class MarketingExecutive extends Employee {
	
	int km_travel;
	int tour_allowance;
	int telephone_allowance;
	
	public MarketingExecutive() {
		super();
		km_travel = 50;
		tour_allowance = 50*5;
		telephone_allowance = 1500;
	}
	public MarketingExecutive(int id, String name, double sal, double medical,int km )
	{
		super(id, name, sal, medical);
		this.km_travel = km;
		this.tour_allowance = km * 5;
		this.telephone_allowance = 1500;
	}
	public String toString()
	{
		return super.toString()+"\nKm Travelled are: "+km_travel+"\nTour Allowance: "+tour_allowance+"\nTelephone Allowance: "+telephone_allowance;
	}

	public static void main(String[] args) {
		MarketingExecutive m1 = new MarketingExecutive();
		System.out.println(" "+m1.toString());
		System.out.println();
		

		MarketingExecutive m2 = new MarketingExecutive(103,"Hr one",60000,150,250);
		System.out.println(" "+m2.toString());

	}

}
