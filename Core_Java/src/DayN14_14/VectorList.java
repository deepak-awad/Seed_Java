package DayN14_14;
import java.util.*;

/*** Array list Vector List ***/

public class VectorList {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		
		//display using for loop
		for(int i : v)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		
		//add a particular position 
		v.add(0, null);
		System.out.println("Add a particulatr position: "+v);
		
		//add a particular position 
	    v.add(4,15);
		System.out.println("Add a particulatr position: "+v);
		
		//add element 
		v.addElement(null);
		System.out.println("Add a particulatr position: "+v);
		
		//clear element 
		//v.clear();
		//System.out.println("Add a particular position: "+v);
		
		//contains- if there is present element
		System.out.println("The elemnt is present or not: "+v.contains(10));
		
		//capacity of element
		System.out.println("The capacity is: "+v.capacity());
		
		System.out.println(v.clone());
		
		//convert to array
		//Integer arr[] = new Integer[5];
		//v.copyInto(arr);
		  // System.out.println("Elements in an array are: ");  
	       // for(Integer num : arr)  
	        //{  
	          //  System.out.println(num);  
	        //}        
		
		Iterator itr = v.iterator();
		System.out.println(itr);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println(v.toString());
	}

}
