

public class RegExp {

	public static void main(String[] args) {
		String s = "abcdefgh_23bcdZB_Vsdsd";
		int firstIndex = s.indexOf("_");
		String s2 = s.substring(firstIndex+1, s.indexOf("_", firstIndex+1)).replaceAll("[^a-zA-Z]", "");
		System.out.println(s2);
		
		String s3="3";
		System.out.println(s3.length());
	}

}
