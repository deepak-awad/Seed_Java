package DayN13_13;

/*** Avgcalculate with Generic Methods ***/

public class AvgCal1<T extends Number> {
	
	T[]  arr;
	
	public AvgCal1(T[] arr)
	{
		this.arr =arr;
	}
	public double calculate()
	{
		double sum =0.0;
		for(T i : arr)
		{
			sum = sum + i.doubleValue();
		}
		return sum;
	}
	
	public boolean check(AvgCal1<?> ob)
	{
		if(this.calculate() == ob.calculate())
		{
			return true;
		}
		return false;
		
	}
	
	
	
	public static void main(String args[])
	{
		Integer arr[] = {10,20,30,40,50};
		AvgCal1<Integer> a = new AvgCal1(arr);
		System.out.println(a.calculate());
		

		Integer arr1[] = {10,20,30,40,50};
		AvgCal1<Integer> a2 = new AvgCal1(arr);
		System.out.println(a2.calculate());
		
		if(a.check(a2))
		{
			System.out.println("Equlas");
		}else
		{
			System.out.println("Not equals");
		}
		
	}

}
