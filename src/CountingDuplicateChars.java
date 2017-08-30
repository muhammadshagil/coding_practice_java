import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicateChars {
	
	  public static int duplicateCount(String text) {
		  
		  Long count =  text.chars().map(c->Character.toUpperCase(c)).distinct() //distinct of char stream - ignore case
				  .map(s->text.length() - text.toUpperCase().replaceAll((""+(char)s), "").length())// map each char to count its occurrence. 
				  .filter(n->n>1).count(); //filter occurrence of char >1
		  return count.intValue();
		  
		  
//		  return (int)text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k->k,Collectors.counting())).values().stream().filter(e->e>1).count();
		  }

	public static void main(String[] args) {
		System.out.println(CountingDuplicateChars.duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyZ"));

	}

}
