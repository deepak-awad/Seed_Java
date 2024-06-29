package EmployalibilityLab.Problem5;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Ticket tk = new Ticket();
		Scanner sc = new Scanner(System.in);
		int css  =Ticket.availableTickets;
		System.out.println("Available Tickets are: "+Ticket.availableTickets);
		
		if(css > 0)
		{
			System.out.println("Enter tickets to be buy :");
			int tks = sc.nextInt();
			tk.calculateTotalCost(tks,2000);
			int avtk = css - tks;
			System.out.println("Available tickets are: "+avtk);
			
			if(avtk >= 0 || avtk >= -1)
			{
				System.out.println("Tha tickts are not available"+-1);
			}
		}
		else
		{
			System.out.println("Tha tickts are not available"+-1);
		}
	}
}
