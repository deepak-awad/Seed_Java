package DayN13_13;

/*** With super class example ***/

public class AvgCalci<T extends Number> {
	
	T [] arr;
	
	public AvgCalci(T arr[])
	{
		super();
		this.arr = arr;
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

	public static void main(String[] args) {
	
		Integer arr[] = {10,20,30,40,50};
		AvgCalci<Integer> avg = new AvgCalci(arr);
		System.out.println(avg.calculate());
		
	}

}
