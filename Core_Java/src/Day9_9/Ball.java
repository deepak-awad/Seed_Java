package Day9_9;

/*** Sharpen Your Pencil class car implements from moveable and bounceable interface ***/

public class Ball implements Bounceable, Moveable {

	@Override
	public void move() {
		System.out.println("Ball is moveable");
		
	}

	@Override
	public void bounce() {
		System.out.println("Ball is bouncable");
		
	}
	

}
