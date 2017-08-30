
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneNumberCreator {
	
	public static String createPhoneNumber(int[] numbers) {
		// returns "(123) 456-7890"
//		String[] numberList =new String[] {"(","","","",")"," ","","","","-","","","",""};
//		
//		for(int i = 0; i<10; i++) {
//			int n = numbers[i];
//			int current = 0;
//			for(int j = current; ;j++){
//				if(numberList[j] == ""){
//					numberList[j] = String.valueOf(n);
//					break;
//				}
//			}
//		}
//		return Arrays.asList(numberList).stream().collect(Collectors.joining(""));
		
		
		//actual way
//		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0],numbers[1],numbers[2],
//				numbers[3],numbers[4],numbers[5],
//				numbers[6],numbers[7],numbers[8],numbers[9]);
		
		
//		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
		
		
//		Integer[] integerNumbers = (Integer[]) Arrays.stream(numbers).boxed().toArray();
		
		Integer[] integerNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
		
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", integerNumbers);
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String s = PhoneNumberCreator.createPhoneNumber(numbers);
		System.out.println(s);

	}

}
