package DayN12_12_Assignment.Program_1;

/*** Write a Java Program Accept a number from user and
Generate exception if number is between 
         0-10 SmallNumberException 
        11-15 ProperNumberException 
        16-20 GreaterNumberException  ***/

public class Number {
	int number;
	
	public Number(int number)
	{
		this.number = number;
	}
	public void checkException() 
	{
		try
		{
			if(number >=0 && number <=10)
			{
				throw new SmallNumberException();
				
			}else if(number >=11 && number <=15)
			{
				throw new ProperNumberException();
				
			}else if(number >=16 && number <=20 )
			{
			   throw new GreaterNumberException();	
			}else
			{
				System.out.println("Out off Exception");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Number n1 = new Number(6);
		n1.checkException();

	}

}
