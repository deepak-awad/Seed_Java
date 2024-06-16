package Day7_7_Assignment.Program_1;
import java.util.Scanner;

import Day7_7_Assignment.Program_2.Book;

/*** Write a Java Program to create a class bank Account having member fields
 account number,customer name,balance,city and member methods are
 default constructor,parameterized constructor,create account,withdraw amount
 ,deposit amount,transfer amount from one account to another,display all
 account details,display account details by city name,display account
 details by account number.
Use Hints:
 Account number is auto generated.
 Display methods are overloaded.
 Array of objects
 Write Menu Driven Program.
 Add necessary Fields or methods in class. ***/

public class Account {
	
	int account_number;
	String customer_name;
	double balance;
	String city;
	static int count;
	
	public Account()
	{
		account_number = ++count;
		customer_name =null;
		balance =0.0;
		city = null;
	}
	public Account(String name, double balance, String city)
	{
		this.account_number = ++count;
		this.customer_name = name;
		this.balance = balance;
		this.city = city;
	}
	public void display()
	{
		System.out.println("Account id: "+account_number);
		System.out.println("\nCustomer Name: "+customer_name);
		System.out.println("\nCustomer Balance: "+balance);
		System.out.println("\nCity is: "+city);
	}
	public void withdraw(int withdarw)
	{
		balance-=withdarw;
		System.out.println("Amount withdraw Succcessfully"+balance);
	}
	public void deposit(int deposit)
	{
		balance+=deposit;
		System.out.println("Amount deposit Succcessfully"+balance);
		
	}
	 public void transfer(Account receiver, double am) 
	 {
	        if (balance >= am) 
	        {
	            this.balance -= am;
	            receiver.balance += am;
	            System.out.println("Transfer successful.");
	        } else {
	            System.out.println("Transfer failed due to insufficient balance.");
	        }
	    }
	public static void main(String[] args) {
		int choice=0;
		
		Account account[] = new Account[100];
		
		do
		{
			System.out.println("Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Amount Transfer");
            System.out.println("5. Display all Account Details");
            System.out.println("6. Display Account Details by name");
            System.out.println("7. Display Account Details by account number");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            
            switch(choice)
            {
            
            case 1: 
            	System.out.println("1. Create Account");
            	System.out.println("Enter number of account to add");
            	Scanner sc1 = new Scanner(System.in);
            	int no1 = sc1.nextInt();
            	
            	for(int i =0;i< no1; i++)
            	{
         
            		System.out.println("Enter Customer name: ");
            		Scanner sc3= new Scanner(System.in);
            		String name = sc3.next();

            		System.out.println("Enter Balance: ");
            		Scanner sc4= new Scanner(System.in);
            		double balance = sc4.nextInt();
            		
            		System.out.println("Enter city: ");
            		Scanner sc5= new Scanner(System.in);
            		String city = sc5.next();
            		
            		account[i] = new Account( name,balance ,city);	
            	}
         	
            	break;
            	
            case 2:
            	System.out.println("2. Withdraw Amount");
            	System.out.println("Enter accont number:");
            	Scanner s11 = new Scanner(System.in);
            	int accnumber = s11.nextInt();
            	
            	for(int i = 0;i<account.length;i++)
            	{
            		if(account[i].account_number == accnumber)
            		{
            			System.out.println("Account number found");
            			System.out.println("Enter Amount to be withdraw: ");
            			Scanner s12 = new Scanner(System.in);
            			int withdraw = s12.nextInt();
            			
            			if(account[i].balance > withdraw)
            			{
            				account[i].withdraw(withdraw);
            				break;
            			}else
            			{
            				System.out.println("Amount is not withdraw");
            			}
            			
            			
            		}else
            		{
            			System.out.println("Account number not found");
            		}
            	}
            	
            	
            	break;
            	
            	
            case 3:
            	System.out.println("3. Deposit Amount");
            	
            	System.out.println("Enter accont number:");
            	Scanner s13 = new Scanner(System.in);
            	int accnumber1 = s13.nextInt();
            	
            	for(int i = 0;i<account.length;i++)
            	{
            		if(account[i].account_number == accnumber1)
            		{
            			System.out.println("Account number found");
            			System.out.println("Enter Amount to be deposit: ");
            			Scanner s12 = new Scanner(System.in);
            			int deposit = s12.nextInt();
            			
            			if(account[i].balance > 0)
            			{
            				account[i].deposit(deposit);
            				break;
            			}else
            			{
            				System.out.println("Amount is not withdraw");
            			}
            			
            			
            		}else
            		{
            			System.out.println("Account number not found");
            		}
            	}
            	
            	break;
            	
            	
            	
            case 4:
            	System.out.println("Transfer Amount");
                System.out.print("Enter sender account number: ");
                int senderAccNumber = sc.nextInt();

                Account senderAccount = null;
                Account receiverAccount = null;

                for (Account acc : account) 
                {
                    if (acc != null && acc.account_number == senderAccNumber) 
                    {
                        senderAccount = acc;
                    }
                }

                if (senderAccount != null)
                {
                    System.out.print("Enter receiver account number: ");
                    int receiverAccNumber = sc.nextInt();

                    for (Account acc : account)
                    {
                        if (acc != null && acc.account_number == receiverAccNumber) 
                        {
                            receiverAccount = acc;
                        }
                    }

                    if (receiverAccount != null) 
                    {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = sc.nextDouble();
                        senderAccount.transfer(receiverAccount, transferAmount);
                        
                    } else
                    {
                        System.out.println("Receiver account not found.");
                    }
                } else
                {
                    System.out.println("Sender account not found.");
                }
                break;
            	
            	
            case 5:
            	 System.out.println("5. Display all Account Details");
             	System.out.println("All Account Details are:");
             	for(Account a1 : account)
             	{
             		if( a1 != null)
             		{
             			a1.display();
 	                    System.out.println();
             		}
             		
             	}
            	break;
            	
            	
            case 6:
                System.out.println("6. Display Account Details by name");
                System.out.println("Enter the account name: ");
             	Scanner sc7 = new Scanner(System.in);
             	String name = sc7.next();
             	
             	for(Account a1 : account)
             	{
             		if(a1 != null && a1.customer_name.equals(name) )
             		{
             			System.out.println("Account Found");
             			a1.display();
             		}
             		else
             		{
             			System.out.println("Account not Found");
             			break;
             		}
             	}
            	break;
            	
            case 7:
            	System.out.println("7. Display Account Details by account number");
            	System.out.println("Enter the account number: ");
             	Scanner sc8 = new Scanner(System.in);
             	int number = sc8.nextInt();
             	
             	for(Account a1 : account)
             	{
             		if(a1 != null && a1.account_number == number )
             		{
             			System.out.println("Account Found");
             			a1.display();
             		}
             		else
             		{
             			System.out.println("Account not Found");
             			break;
             		}
             	}
            	break;
            	
            }
            
		}while(choice !=0);
		
	}

}
