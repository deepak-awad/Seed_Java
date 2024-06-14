package Day7_7_Assignment.Program_N10;

/*** Create a class Operations which provides the following functionality:
a.     Addition of two numbers
b.     Addition of three numbers
c.      Addition of two float values
Use methods to perform these tasks. These methods should return value.
Invoke these methods from main () written in TestOperations class.
3.     Manish got confused to calculate the volume of a cylinder and cuboid. Write a Java application to do this.
Create a class VolumeCalculator that contains the following methods:
double calculateVolume(double radius, double height) – This method calculates the volume of cylinder with the formula PI * radius * height.
double calculateVolume(int length, int breadth, int height) – This method calculates the volume of cuboid using the formula length * breadth * height.
Write TestMain class to test the application.  ***/

public class Operations {
	
	public int Add(int num1, int num2)
	{
		return num1 + num2;
	}
	public int Add(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
	public float Add(float num1, float num2)
	{
		return num1 + num2;
	}
}
