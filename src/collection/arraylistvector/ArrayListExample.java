package arraylistvector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("student1");
		stringList.add("student2");
		stringList.add("student3");
		stringList.add("student4");
		
		Iterator<String> iterator = stringList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
