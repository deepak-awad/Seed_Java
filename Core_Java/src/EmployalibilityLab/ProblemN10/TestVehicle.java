package EmployalibilityLab.ProblemN10;
import java.util.Scanner;

public class TestVehicle {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vehicle Number: ");
		int no = sc.nextInt();
		System.out.println("Enter the model Name: ");
		String name= sc.next();		
		System.out.println("Enter the vehicle Type: ");
		String type= sc.next();
		
		System.out.println("Enter the vehicle price: ");
		int price= sc.nextInt();
		
		Vehicle v = new Vehicle(no, name, type, price);
		v.issueLoan();
		v.takeInsurance();
		
		
		
	}

}
