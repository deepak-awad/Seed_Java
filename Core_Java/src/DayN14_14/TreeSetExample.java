package DayN14_14;
import java.util.*;
/*** Set Tree Set ***/

public class TreeSetExample {
	
	public static void main(String args[])
	{
		TreeSet<String> t = new TreeSet<>();
		t.add("Deepak");
		t.add("Yash");
		t.add("Ashwini");
		t.add("Jnabai");
		
		System.out.println(" "+t);
		
		TreeSet<String> t2 = new TreeSet<>();
		t2.add("Rupesh");
		t.addAll(t2);
		
		System.out.println(" "+t);
		
		Iterator itr = t.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next());
		}
		
		
		System.out.println(" "+t.pollFirst());
		System.out.println(" "+t.pollLast());
		
		System.out.println(" "+t);
		
	    System.out.println();
	    
	    TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);  
          
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet("C", false));  
         
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+set.tailSet("C", false));  
	}

}
