package Day7_7_Assignment.Program_6;

/***   Define a class called Player with following specifications:
Private members are:
Player code              int
player name             String
Public members are:
Player                         parameterized constructor with two arguments
PrintDetails()            method that displays data for all data members.
Also implement the functionality to count the number of objects created. [Hint: use static member]
Write main() to test the functionality. ***/

public class Player {
	
	private int Player_code;
	private String name;
	public static int count;
	
	static 
	{
		count=0;
	}
	
	public Player(int code, String name)
	{
		this.Player_code = code;
		count++;
		this.name = name;
	}
	public void printDetails()
	{
		System.out.println("Player Code: "+Player_code);
		System.out.println("Name :"+name);
		System.out.println("\n");
	}

	public static void main(String[] args) {
		
		Player p1 = new Player(101, "Deepak Awad");
		p1.printDetails();
		Player p2 = new Player(102, "Deepak Awad");
		p2.printDetails();
		System.out.println("The number of objects are:"+count);

	}

}
