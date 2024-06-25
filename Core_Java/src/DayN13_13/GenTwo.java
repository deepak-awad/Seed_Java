package DayN13_13;

/*** GenTwo<T, V> parameter with example ***/

public class GenTwo<T, V> {
	
	T obj1;
	V obj2;
	
	public GenTwo(T t1, V t2)
	{
		this.obj1 = t1;
		this.obj2 = t2;
	}
	public T getobj1()
	{
		return obj1;
		
	}
	public V getobj2()
	{
		return obj2;
		
	}

	public static void main(String[] args) {
		
		GenTwo<Integer, String> isob = new GenTwo(100, "Hello World!");

		Integer i = isob.getobj1();
		System.out.println(i);
		
		String str1 = isob.getobj2();
		System.out.print(str1);
		
	}

}
