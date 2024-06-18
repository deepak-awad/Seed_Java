package Day9_9_HomeWork;

/*** sharpen your pencil class Test Remote Main  ***/

public class TestRemote {

	public static void main(String[] args) {
		RemoteDevice d;
		
		d= new Tv();
		d.switchOn();
		d.switchOff();
		
		d= new DVDPlayer();
		d.switchOn();
		d.switchOff();

	}

}
