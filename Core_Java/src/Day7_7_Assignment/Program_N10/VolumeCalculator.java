package Day7_7_Assignment.Program_N10;

/*** Volume Calculator class ***/

public class VolumeCalculator {
	
	double Pi=3.14f;
	
	double calculateVolume(double radius, double height)
	{
		return Pi* radius * radius * height;
	}
	double calculateVolume(int length, int breadth, int height)
	{
		return length * breadth * height;
	}

}