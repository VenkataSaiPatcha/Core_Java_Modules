package Java_8_Feactures;

import java.util.Arrays;
import java.util.List;

public class Java8Demo01 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Sai","Venkat","Ravi");
		list.stream().filter(name -> name.startsWith("S")).map(String ::toUpperCase)
		.forEach(nam->System.out.println(nam));
		
	}

}
