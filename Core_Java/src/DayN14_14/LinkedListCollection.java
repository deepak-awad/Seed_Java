package DayN14_14;
import java.util.LinkedList;
import java.util.*;

/*** Array list Linked List ***/

public class LinkedListCollection {

	public static void main(String[] args) {
		
		LinkedList <String> str = new LinkedList();
		
		//add element in it 
		str.add("Hello");
		str.add("new node");
		str.add("Hello java");
		str.add("new data");
		
		//print the element
		System.out.println("The String is: "+str); 
		
		//display using the iterator
		Iterator itr = str.iterator();
		System.out.println("The String is: "+itr); 
		
		//By using the while loop
		System.out.println("By usig while loop");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		//add First position
		str.addFirst("Deepak");
		System.out.println("The String is: "+str); 
		
		//add Last Position
		str.addLast("Yash");
		System.out.println("The String is: "+str); 
		
		//add a particluar position
		str.add(1, "Anjali");
		System.out.println("The String is: "+str); 
		
		//size in list
		System.out.println("The size of array is: "+str.size());
		
		// remove first
		str.removeLast();
		str.removeFirst();
		str.remove(0);
		System.out.println("The String is: "+str); 
		
	}

}
