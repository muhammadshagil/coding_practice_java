package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JavaStreamTest {

	public static void main(String[] args) {
		//Filter example
		List<String> stringList = Arrays.asList("abc","","qwe","er","");
		List<String> filtered = stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()); 
		System.out.println(filtered);
		
		//foreach , limit & sorted
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		//distinct
		List<Integer> intList = Arrays.asList(2,3,5,2,3,6,7);
		List<Integer> distList = intList.stream().distinct().collect(Collectors.toList());
		
		//map 
		List<Integer> distSquareList = intList.stream().map(i->i*i).distinct().collect(Collectors.toList());
				
		distSquareList.forEach(System.out::println);
		
		//count of empty string using filter
		List<String> stringList2 = Arrays.asList("","abv","abc","","","sdf");
		long count = stringList2.stream().filter(string->string.isEmpty()).count();
		System.out.println("count of empty string : "+count);
		
		
	}

}
