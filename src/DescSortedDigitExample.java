import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class DescSortedDigitExample {

	public static int sortDesc(final int num) {
		//32782
//		ArrayList<Integer> numList = new ArrayList<Integer>();
//		if (num > 0) {
//			int tempNum = num;
//			while (tempNum > 0) {
//				numList.add(tempNum % 10);
//				tempNum = tempNum / 10;
//			}
//			return Integer.parseInt(numList.stream().sorted(Comparator.reverseOrder()).map(Object::toString).collect(Collectors.joining()));
//		}
//		return num;
		
		//second method
		String s = String.valueOf(num).chars().mapToObj(ch->String.valueOf(Character.getNumericValue(ch))).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		return Integer.parseInt(s);
		
//		String[] numArray = String.valueOf(num).split("");
//		Arrays.sort(numArray, Comparator.reverseOrder());
//		return Integer.parseInt(String.join("", numArray));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sortDesc = DescSortedDigitExample.sortDesc(453215);
		System.out.println(sortDesc);

	}

}
