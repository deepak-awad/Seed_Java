package EmployalibilityLab.Problem6;
import java.util.Scanner;

public class MainClass {
	
	public static Hosteller getHostellerDetails()
	{
		return new Hosteller(101,"Deepak",15,"Abc",105);
		
	}
	
	public static void main(String args[])
	{
		Hosteller hostel = getHostellerDetails();
		
		 int choice;
	   do
	   {
		   System.out.println("what you wan to change: \n"
		   		+ "\n1)Hostel Name"
		   		+ "\n2)Romm No"
		   		+ "\n3)Display details");
		   System.out.println("Enter choice :");
		   Scanner sc = new Scanner(System.in);
		   choice = sc.nextInt();
		   
		   switch(choice)
		   {
		   case 1:
			   System.out.println("\nEnter hotsel name");
			   String name = sc.next();
			   hostel.settHostelname(name);
			   break;
		   case 2:
			   System.out.println("\nEnter hotsel room");
			   int rooom = sc.nextInt();
			   hostel.setRoomno(rooom);
			   break;
		   case 3:
			   System.out.println("\nThe deatils are:");
			   System.out.println("\nTh student id:"+hostel.getStudid());
			   System.out.println("\nTh student name is:"+hostel.getName());
			   System.out.println("\nTh student deptid:"+hostel.getDeptid());
			   System.out.println("\nThe hostel name is:"+hostel.getHostelname());
			   System.out.println("\nThe room no is:"+hostel.getRoomno());
			  break;
			  
			   
			   default:
				   System.out.println("Inavlid Choice");
		   }
	   }while(choice != 0);
	
		
	}

}
