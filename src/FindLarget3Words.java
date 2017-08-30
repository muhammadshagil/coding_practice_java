
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FindLarget3Words implements Comparator{

	static public void main(String[] args) {
		String s="hai hello agudmorning asachin awelcome to our new aoffice";
		List<String> wordList = Arrays.asList(s.split(" "));
//		wordList.sort(new Test());
//		Collections.reverse(wordList);
//		Iterator it = wordList.iterator();
//		for(int i=0;i<3&&it.hasNext();i++) {
//			System.out.println(it.next());
//		}
		System.out.println(wordList.size());
		wordList.sort(new FindLarget3Words());
		Collections.reverse(wordList);
		wordList.stream().limit(3).forEach(System.out::println);
	}

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		if(s1.length() == s2.length()) {
			return 0;
		}
		else if (s1.length() > s2.length()) {
			return 1;
		}
		return -1;
	}
}
