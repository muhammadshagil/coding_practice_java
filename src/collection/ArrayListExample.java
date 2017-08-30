import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("sha");
		arrayList1.add("wee");
		arrayList1.add("sha");
		
		arrayList1.stream().forEach(System.out::println);
		
		Integer one = new Integer(1);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(2);
		arrayList2.add(one);
		arrayList2.add(one);// allows duplicates
		
		arrayList2.stream().forEach(entry->System.out.println(entry));
		
		
		ArrayList<String> arrayList3 = new ArrayList<String>();
		arrayList3.add("ravi");
		arrayList3.add("vinu");
		arrayList3.add("tom");
		
		ArrayList<String> arrayList4 = new ArrayList<String>();
		arrayList4.add("ravi");
		arrayList4.add("vijay");
		arrayList4.add("tom");
		arrayList4.add("ravi");
		arrayList4.removeAll(arrayList3);
		
		System.out.println("removeAll");
		arrayList4.stream().forEach(System.out::println);
		
		
		
		ArrayList<String> arrayList5 = new ArrayList<String>();
		arrayList5.add("ravi");
		arrayList5.add("vijay");
		arrayList5.add("tom");
		arrayList5.add("ravi");
		arrayList5.retainAll(arrayList3);
		System.out.println("retainAll");
		arrayList5.stream().forEach(System.out::println);
		
	}

}
