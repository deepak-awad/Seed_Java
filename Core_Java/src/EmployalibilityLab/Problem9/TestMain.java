package EmployalibilityLab.Problem9;


public class TestMain {
	
	public static void  show()
	{
		Person p = new Nurse("Deepak", 15, "Night", 1500);
		((Nurse) p).calculatePayment();
		p.displayDetails();
		
	}

	public static void main(String[] args) {
		show();

	}

}
