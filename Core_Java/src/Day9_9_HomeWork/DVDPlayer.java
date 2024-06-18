package Day9_9_HomeWork;

/*** sharpen your pencil an class that implements from interface RemoteDevice ***/

public class DVDPlayer implements RemoteDevice {

	@Override
	public void switchOn() {
		System.out.println("DVD Player Switch on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("DVD PLayer Switch off");
		
	}

}
