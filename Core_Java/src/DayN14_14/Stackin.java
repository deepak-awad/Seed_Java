package DayN14_14;
import java.util.*;

/*** Array list Stack ***/

public class Stackin {
	
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack<>();
		
		 //empty stack or not
		 System.out.println("The stack is empty or not: "+st.empty());
		
		//push elements
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("The stack elements are: "+st);
		
		//pop elements
		 st.pop();
		// st.pop();
		 System.out.println("The pop elemnst are: "+st);
		 
		 //Top most element
		 System.out.println("The pop elemnst are: "+st.peek());
		 
		 //empty stack or not
		 System.out.println("The stack is empty or not: "+st.empty());
		 
		 //element search in stack
		 System.out.println("The element in stack is: "+st.search(10));
		
	}

}
