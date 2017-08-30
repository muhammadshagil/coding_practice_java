import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingOddNumsArray {
	  public static int[] sortArray(int[] array) {
		  OfInt oddArray = Arrays.stream(array).filter(e->e%2!=0).sorted().iterator();
//		  IntStream.range(0, array.length).forEach(i->{if(array[i]%2 != 0) array[i] = oddArray.nextInt();} );
		  
		  return IntStream.of(array).map(e->e%2==0?e:oddArray.nextInt()).toArray();
		  
//		  for(int i=0,s=0;i<array.length;i++) {
//			  if(array[i]%2!=0) {
//				  array[i] = oddArray[s++];
//			  }
//		  }
//		  return array;
		  }

	public static void main(String[] args) {
		int[] array = {5, 3, 2, 8, 1, 4};
		SortingOddNumsArray.sortArray(array);
		
		Arrays.stream(SortingOddNumsArray.sortArray(array)).forEach(System.out::println);

	}

}
