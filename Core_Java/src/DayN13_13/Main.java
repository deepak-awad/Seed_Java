package DayN13_13;

/*** Gen Main class ***/

public class Main {
	
	public static void data(Gen<?> ob)
	{
		System.out.println(ob.getObj());
	}

	public static void main(String[] args) {
		Gen<Integer> g = new Gen<>(new Integer(10));
		data(g);
		

	}

}
