package InterviewCde;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class NonRepatingString
{
	public static void main(String[] args) {
		
		String str = "example";
		
		List<Character> nonRepating=str.chars()
			.mapToObj(c -> (char)c)
			.collect(Collectors.
			groupingBy(Function.identity(),
					LinkedHashMap :: new,
					Collectors.counting()
					))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
System.out.println("First non - repating char:"+nonRepating);
			
		
	}

}
