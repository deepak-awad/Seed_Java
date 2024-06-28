package DayN12_12_Assignment.Program_5;
import java.util.*;

/*** Write a Java Program to accept a username and password
from user(admin & admin123).give three attempt if not
then raise InvalidUserNameException or InvalidPasswordException.  ***/

public class User {
	
	public static void main(String arsg[])
	{
		String user, password;
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a user name: ");
			user = sc.next();
			
			if(user.equals("admin"))
			{
				System.out.println("Your username correct");
			}
			else
			{
				throw new InvalidUserNameException();
				
			}
			System.out.println("Enter a user password: ");
			password = sc.next();
			
			if(password.equals("admin123"))
			{
				System.out.println("Your login Successfully");
			}else
			{
				throw new InvalidPasswordException();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			sc.close();
		}
		
	}

}
