import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet1 = new HashSet<String>();
		hashSet1.add("test1");
		hashSet1.add("test3");
		hashSet1.add("test1");
		hashSet1.add("test2");
		hashSet1.add("atest");
		
		hashSet1.stream().forEach(System.out::println);

	}

}
