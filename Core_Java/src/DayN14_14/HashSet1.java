package DayN14_14;
import java.util.*;

/*** Set Hash Set ***/

public class HashSet1 {

	public static void main(String[] args) {
		
		 HashSet<Integer> set=new HashSet<>();  
		 
		 set.add(10);
		 set.add(20);
		 System.out.print(" "+set);
		 System.out.println();
		 set.add(30);
		 System.out.print(" "+set);
		 System.out.println();

		 HashSet<Integer> set2 = new HashSet<>();
		 set2.add(50);
		 set2.add(60);
		 set.addAll(set2);
		 System.out.print(" "+set);
		 System.out.println();
		 
		 System.out.println("Is empty or not:"+set.isEmpty());
		 
		 System.out.println("The elemnt is present or not:"+ set.contains(10));
		 
		 set.remove(10);
		 System.out.println("Is empty or not:"+set);
		 
		 
		 //iterator
		 Iterator itr = set.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(""+itr.next());
		 }
		 
		 System.out.println("The size of set:"+set.size());
		 
		 
	}

}
