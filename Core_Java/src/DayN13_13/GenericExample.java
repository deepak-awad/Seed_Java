package DayN13_13;

/*** Example with generic  ***/

public class GenericExample<T> {
	
	T obj;
	
	public GenericExample(T obj)
	{
		this.obj = obj;
	}
	public T get()
	{
		return obj;
	}
	
	
	public static void main(String args[])
	{
		GenericExample<Integer> i = new GenericExample<Integer>(new Integer(10));
		Integer obj  = i.get();
		System.out.println(obj);
		
		GenericExample<String> str = new GenericExample<String>("Hello");
		String str1 = str.get();
		System.out.print(str1);
		
	}

}
