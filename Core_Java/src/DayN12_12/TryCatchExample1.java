package DayN12_12;

/*** Try Catch Example 1 ***/

public class TryCatchExample1 {
	
	public static void main(String args[])
	{
		try
		{
			int n1 = 10;
			int n2 = 10;
			int n3 = n1 / n2;
			System.out.println(n3);
			
			int arr[]= new int[2];
			arr[0]=10;
			arr[1]=20;
			arr[3]=40;
			arr[4]=50;
			
			for(int a : arr)
			{
				System.out.print(a);
			}
						
			
		}catch(ArithmeticException e)
		{
			System.out.println("Airthmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End main");
		
	}

}
