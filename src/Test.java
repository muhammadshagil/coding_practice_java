
public class Test implements TestInterface{

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Shiver Me Tim");
		sb.reverse();
		System.out.println(sb);

		
		String s1="test";
		String s2 =new String("test");
		System.out.println(s1.compareTo(s2));
		
		TestInterface.nestedClass nestedClass = new nestedClass();
		nestedClass.print();
		
		String tenChars = "AAAbAAAAAAA";
		System.out.println(tenChars.replaceAll("AAA", "LLL"));
	}

}


interface TestInterface {
	public static final class nestedClass {
		public void print() {
			System.out.println(" interface inner class");
		}
	}
}