package DayN18_18;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class Program1 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,3,4,5));
		
		// filter out data
		List<Integer> res = (List<Integer>) arr.stream()
				.filter(value -> value % 2==0)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(res.toArray()));
		
		
		// Map function
		
		List<Integer> res1 =(List<Integer>) arr.stream()
				.map(value -> value * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(res1.toArray()));
		
		//Sorted function
		
		System.out.println("Asending order: ");
		arr.stream().sorted()
		.forEach(System.out::println);
		
		System.out.println("Desnding order: ");
		arr.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		//peek function
		List<Integer> res3 = arr.stream()
				.filter(value -> value % 2 == 0)
				.peek(value -> System.out.println("Filetered value:"+value))
				.map(value -> value * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(res3.toArray()));		
		
		//distinct function
		List<Integer> dis = arr.stream()
				               .distinct()
				               .collect(Collectors.toList());
		System.out.println(Arrays.toString(dis.toArray()));
		
		//skip function
		List<Integer> res4 = arr.stream()
				.skip(3)
				.collect(Collectors.toList());
		System.out.println(res4);
		
		//limit function
		List<Integer> res5 = arr.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(res5);
		
	}

}
