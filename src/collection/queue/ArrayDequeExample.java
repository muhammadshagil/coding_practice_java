package queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("value1");
		arrayDeque.add("value2");
		arrayDeque.add("value3");
		arrayDeque.add("value4");
		arrayDeque.offerFirst("value10");
		arrayDeque.offerLast("value10");
		
		String pollFirst = arrayDeque.pollFirst();
		
		System.out.println("poll first : "+pollFirst);
		
		for(String value : arrayDeque) {
			System.out.println(value );
		}
		

	}

}
