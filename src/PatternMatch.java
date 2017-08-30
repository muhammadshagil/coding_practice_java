import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	final static Pattern pattern = Pattern.compile("<value>(.+?)</value>.*<string-value>(.+?)</string-value>");
	public static void main(String[] args) {
//		String s = "<equals><value>order.CAOrder</value><constant><data-type>java.lang.Boolean</data-type><string-value>true</string-value></constant></equals>";
//		Matcher matcher = pattern.matcher(s);
//		matcher.find();
//		System.out.println(matcher.group(1));
//		System.out.println(matcher.group(2));
//		String pmdl = "<and><or><equals><value>order.CAOrder</value><constant><data-type>java.lang.Boolean</data-type><string-value>true</string-value></constant></equals><equals><value>order.USOrder</value><constant><data-type>java.lang.Boolean</data-type><string-value>true</string-value></constant></equals></or><or><equals><value>profile.VIBStatus</value><constant><data-type>java.lang.String</data-type><string-value>BI</string-value></constant></equals><equals><value>profile.VIBStatus</value><constant><data-type>java.lang.String</data-type><string-value>VIB</string-value></constant></equals></or></and>";
		String pmdl="";
		List<String> list = new ArrayList<String>();
    	Pattern pattern = Pattern.compile("<equals>(.+?)</equals>");
    	Matcher matcher = pattern.matcher(pmdl);
    	while(matcher.find()){
    		list.add(matcher.group(1));
    	}
    	System.out.println(list.isEmpty());
    	list.stream().forEach(System.out::println);

	}

}
