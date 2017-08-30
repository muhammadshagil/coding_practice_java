
public class StaticBlockClass {
	
	public static int static1;
	static {
		static1 = 2;
		System.out.println(static1);
	}
	
	public static class StaticClass {
		public static String staticString = "static class example";
		public String nonstaticString = "non static string";
	}
	
	public static void main(String[] args) {
		StaticClass st = new StaticBlockClass.StaticClass ();
		System.out.println(st.nonstaticString);
		System.out.println(st.staticString);
		
		System.out.println(StaticBlockClass.StaticClass.staticString);
	}
}
