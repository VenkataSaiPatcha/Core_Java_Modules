package Java_8_Feactures;

import java.util.Optional;

public class OptionalClass
{
	public static void main(String[] args) 
	{
//		Optional<String> name = Optional.of(null);
//		System.out.println(name.get());
		
//		Optional<String> name = Optional.ofNullable(null);
//		System.out.println(name.isPresent()); // false
//		System.out.println(name.isEmpty()); //true
		
//		Optional<String> name = Optional.empty();
//		System.out.println(name.isEmpty());
//		System.out.println(name.isPresent());
		
//		
//		Optional<String> name = Optional.ofNullable("sai");
//		System.out.println(name.orElse("Default value"));
		
//		Optional<String> name = Optional.ofNullable(null);
//		System.out.println(name.orElseGet( ()-> "Generated value"));
		
//		Optional<String> name = Optional.ofNullable("Sai");
//		System.out.println(name.orElseThrow(()-> new IllegalArgumentException("value is missing")));
//		
//		Optional<String> name = Optional.ofNullable("Sai");
//		name.ifPresent(n -> System.out.println("Hello "+n));
		
//		Optional<String> name = Optional.ofNullable("Sai");
//		System.out.println(name.map(String :: toUpperCase).get());
		
//		Optional<String> name = Optional.ofNullable("Sai");
//		Optional<Integer> length = name.flatMap(s-> Optional.of(s.length()));
//		System.out.println(length.get());
		
		String  str = null;
		//System.out.println(str.toUpperCase());
		
//		Optional<String> name = Optional.ofNullable("sai");
//		System.out.println(name.orElse("No value is there"));
		
		Optional<String> optional = Optional.of("Sai");
		Optional<Integer> length = optional.flatMap(n -> Optional.of(n.length()));
		System.out.println(length.get());
		
		optional.ifPresent(n -> System.out.println(n.toLowerCase()));
		
	}

}
