import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("ravi");
		linkedHashSet.add("vijay");
		linkedHashSet.add("ravi");
		linkedHashSet.add("sethu");
		linkedHashSet.add("vijay");
		
		linkedHashSet.stream().forEach(System.out::println);

	}

}
