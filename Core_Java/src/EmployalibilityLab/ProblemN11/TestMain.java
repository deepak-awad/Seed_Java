package EmployalibilityLab.ProblemN11;

import java.util.*;

public class TestMain

{

  public static BusTicket getTicketDeatils()

  {

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Name:");

    String name=sc.next();

    System.out.println("Enter Gender(m/f):");

    char gen=sc.next().charAt(0);

    System.out.println("Enter Age:");

    int age=sc.nextInt();

    System.out.println("Enter Ticket No:");

    int tno=sc.nextInt();

    System.out.println("Enter Ticket Price:");

    float tprice=sc.nextFloat();

    BusTicket bt= new BusTicket(tno,tprice,new Person(name, gen, age));

	return bt; 

  }

	

  public static void main(String[] args) 

  {

	  

	BusTicket obj=getTicketDeatils();

	obj.calculateTotal();

	obj.display();

	

	

	 

  }//end main

}//end class

