package Day3_3;

/*** sharpen your pencil Method Overloading Airthmetic class with Calculator main class ***/

public class Calculator {

	public static void main(String[] args) {
		
		Airthmetic a1 = new Airthmetic();
		a1.multiply(10, 20);
		a1.multiply(10, 20, 3.5f);
		a1.multiply(10.5f, 20.0f);
		a1.multiply(10l, 20l);
		
	}

}
