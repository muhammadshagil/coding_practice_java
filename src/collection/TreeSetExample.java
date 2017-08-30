import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("vijay");
		treeSet.add("apps");
		treeSet.add("aaa");
		treeSet.add("boy");
		
		
		Iterator<String> it =treeSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
