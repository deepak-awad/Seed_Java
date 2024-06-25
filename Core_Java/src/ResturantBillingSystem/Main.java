package ResturantBillingSystem;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
      int choice = 0;
      Scanner sc= new Scanner(System.in);
      
      Customer c[] = new Customer[100];
      
      do
      {
    	  try
    	  { 
    		  System.out.println("************************************************************ Resturant Billing System ************************************************************");
    		  System.out.println("1) Wadapav - 15/- \n2) Tea - 10/- \n3) PavBhaji - 30/- \n4) Chapati - 11/-");
    		  System.out.println("***************************************************************************************************************************************************");
    		  
    		  System.out.println("\n1) Add Customer"
    		  		+ "\n2) Search customer by Id:"
    		  		+ "\n3) Search customer by Name:"
    		  		+ "\n4) exit");
    		  System.out.println("\n-- Select choice --:");
    		  choice = sc.nextInt();
    		
    		  switch(choice)
    		  {
    		  case 1:
    			  System.out.println("Add Customer Details:");
    			  
    			  System.out.println("Enter number of customer to add:");
    			  int n = sc.nextInt();
    					  
    			  for(int i =0; i<n;i++)
    			  {
    				 System.out.println("Enter customer name: ");
    				 String name = sc.next();
    				 
    				 System.out.println("Enter customer number: ");
    				 int number = sc.nextInt();
    				 
    				 c[i] = new Customer(name, number);
    			  }
    			  
    			  break;
    			  
    		  case 2:
    			  break;
    			  
    		  case 3:
    			  break;
    			  
    		  case 5:
    			  break;
    			  
    			  default:
    				  System.out.println("Invalid Choice...");
    		  }
    		  
    		  
    	  }catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
    	  finally
    	  {
    		  sc.close();
    	  }
      }while(choice != 0);
	}

}
