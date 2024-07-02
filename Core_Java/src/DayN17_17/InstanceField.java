package DayN17_17;
import java.util.*;
public class InstanceField {
	
	public static void main(String args[])
	{
		String arr[] = {"Hello", "Deepak"};
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		
		for(String s1 : arr)
		{
			System.out.println(" "+ s1);
		}
	
	}

}
