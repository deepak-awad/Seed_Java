package DayN17_17;

/*** Lambda expression Max example ***/

public class MaxMain {

	public static void main(String[] args) {
		
		Max m = ( a, b) ->{
			if(a > b)
			{
				System.out.print(a);
				return a;
			}else
			{
				System.out.print(b);
				return b;
			}
		};
		m.max(15, 20);

	}

}
