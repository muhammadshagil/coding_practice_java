import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("test1");
		linkedList1.add("test2");
		linkedList1.add("test1");
		linkedList1.add("test3");
		linkedList1.add("test4");
		linkedList1.add("test2");
		
		linkedList1.removeIf(s->s.contains("2"));
		linkedList1.remove("test1");
		
		linkedList1.stream().forEach(System.out::println);

	}

}
