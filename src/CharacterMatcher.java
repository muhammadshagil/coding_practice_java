/*
In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.

The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...

Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm.

You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

The string has a length greater or equal to one and contains only letters from ato z.

#Examples:

s="aaabbbbhaijjjm"
error_printer(s) => "0/14"

s="aaaxbbbbyyhwawiwjjjwwm"
error_printer(s) => "8/22"*/
public class CharacterMatcher {

    public static String printerError(String s) {
//    	s.chars().filter(c->String.valueOf((char)c).matches("[a-m?]")).forEach(ch->System.out.println((char)ch));
    	
    	
//    	return s.chars().filter(c->String.valueOf((char)c).matches("[n-z?]")).count()+"/"+s.length();
    	
//    	long errs = s.chars().filter( ch -> ch > 'm').count();
//        return errs+"/"+s.length();
    	
    	 return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
	public static void main(String[] args) {
		System.out.println(CharacterMatcher.printerError("aaabbbbzhaijjjm"));

	}

}
