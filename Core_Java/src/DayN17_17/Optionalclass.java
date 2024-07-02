package DayN17_17;
import java.util.Optional;

/*** optional class example ***/

public class Optionalclass {
	
	public static void main(String args[])
	{
		String[] words = new String[100];
		
		Optional<String> checknull = Optional.ofNullable(words[5]);
		
		if(checknull.isPresent())
		{
			String word = words[5].toLowerCase();
			System.out.println(word);
			
		}
		else
		{
			System.out.println("word is null");
		}
	}

	
}
