import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(101, "101");
		map.put(102, "102");
		map.put(105, "105");
		map.put(100, null);
		map.put(102, null);
		
		map.entrySet().stream().forEach(e->System.out.println("key : "+e.getKey()+" value : "+e.getValue()));
		
		//output
//		key : 100 value : null
//		key : 101 value : 101
//		key : 102 value : null
//		key : 105 value : 105
	}

}
