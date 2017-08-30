package arraylistvector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> stringVector = new Vector<String>();
		stringVector.add("vector1");
		stringVector.add("vector2");
		stringVector.add("vector3");
		stringVector.add("vector4");
		
		Enumeration<String> enumeration = stringVector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
