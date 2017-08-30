

public class RearrangeMatch {

    public static boolean scramble(String str1, String str2) {
    	for(char ch : str2.toCharArray()) {
    		String s = String.valueOf((char)ch);
    		if(str1.contains(s)) {
    			str1 = str1.replace(s, "");
    		}
    		else {
    			return false;
    		}
    	}
        return true;
    }
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(RearrangeMatch.scramble("cedewaraaossoqqyt", "codewars"));
		System.out.println("Took "+(System.nanoTime() - startTime) + " ns"); 
		
	}

}
