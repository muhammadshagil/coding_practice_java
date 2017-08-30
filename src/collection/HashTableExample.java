import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1002, "1000");
		hashtable.put(1001, "1001");
		hashtable.put(1003, "1003");
		hashtable.put(1000, "1003");
		hashtable.put(1005, "");
		
		hashtable.entrySet().stream().forEach
		(e->System.out.println("key : "+e.getKey()+" value : "+e.getValue()));
		
		//output
//		key : 1000 value : 1003
//		key : 1005 value : 
//		key : 1003 value : 1003
//		key : 1002 value : 1000
//		key : 1001 value : 1001
	}

}
