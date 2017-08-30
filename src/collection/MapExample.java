import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
//		// old non-generic style
//		Map map = new HashMap<>();
//		map.put(1, "ob1");
//		map.put(2, "ob2");
//		map.put(3, "ob3");
//		
//		Set set = map.entrySet();
//		Iterator it = set.iterator();
//		while(it.hasNext()){
//			Map.Entry entry = (Map.Entry) it.next();
//			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
//		}
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ob1");
		map.put(2, "ob2");
		map.put(3, "ob3");
		map.put(3, "ob4");
		
		for(Map.Entry entry : map.entrySet()){
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
		}
		
		//output
//		key : 1 value : ob1
//		key : 2 value : ob2
//		key : 3 value : ob4
		

	}

}
