import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("one");
		arrayDeque.add("two");
		arrayDeque.add("three");
		arrayDeque.add("four");
		arrayDeque.add("five");
		
		
		arrayDeque.poll(); //removes one
		arrayDeque.offerFirst("zero");
		arrayDeque.pollLast(); //removes five
		
		System.out.println("head : peak : " +arrayDeque.peek());
		arrayDeque.stream().forEach(System.out::println);

	}

}
