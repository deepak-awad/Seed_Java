package DayN14_14;
import java.util.*;

/*** Array list collection ***/

public class ArraylistCollection {
	
	public static void main(String args[])
	{
		// Declare the array list
		ArrayList <Integer> list = new ArrayList<>();
		
		//Add element in array
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//printing elements
		System.out.println("The list is: "+list);
		
		//get method
		System.out.println("The list get index is: "+list.get(2));
		
		//add method to particular index
		list.add(1,60);
		System.out.println("The add method at index"+list);
		
		//set method to set element at particular index
		list.set(1,0);
		System.out.println("The set  method at index"+list);
		
		//remove method to remove element at particular index
		list.remove(1);
		System.out.println("The remove method at index"+list);
		
		//size method is used to length of array
		System.out.println("The seiz eof array"+list.size());
		
		//For loop using 
		for(int i=0;i<list.size();i++)
		{
			System.out.println(" "+list.get(i));
		}
		
		//sorting
		Collections.sort(list);
		System.out.println("The sorted list is: "+list);
		System.out.println();
		
		//iterator interface through access method
		Iterator itr  = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
