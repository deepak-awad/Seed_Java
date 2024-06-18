package Day9_9;

/*** Sharpen Your Pencil Interface Main Page ***/

public class InterfaceMain {

	public static void main(String[] args) {
		
		Bounceable b;
		
		b = new Ball();
		b.bounce();
		((Ball)b).move();
		
		Moveable m;
		
		m = new Car();
		m.move();
		

	}

}
