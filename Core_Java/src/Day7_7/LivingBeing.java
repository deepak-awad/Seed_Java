package Day7_7;

/*** sharpen your pencil  Super class and override method from Animal to main Method LivingBeing ***/

public class LivingBeing {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		a= new Elephant();
		a.eat();
		
		a = new Tiger();
		a.eat();

	}

}
