import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumDigitsPower {

    public static List<Long> sumDigPow(long a, long b) {
//    	List<Long> list = new ArrayList<>();
//    	for(long i=a;i<=b;i++) {
//    		List<Double> digitList = String.valueOf(i).chars().mapToDouble(c->Character.getNumericValue(c)).boxed().collect(Collectors.toList());
//    		long sum=0;
//    		for(int j=1;j<=digitList.size();j++){
//    			sum+=Math.pow((Double)digitList.get(j-1), j);
//    		}
//    		if(sum==i) {
//    			list.add(i);
//    		}
//    	}
//        return list;
    	return LongStream.rangeClosed(a, b).filter(i->isValid(i)).boxed().collect(Collectors.toList());
    }
    
    public static boolean isValid(long x) {
    	String s = Long.toString(x);
    	return IntStream.range(0, s.length()).mapToDouble(i->Math.pow(Character.getNumericValue(s.charAt(i)),i+1)).sum() == x;
    }
	public static void main(String[] args) {
		List l = SumDigitsPower.sumDigPow(1, 1000);
		l.stream().forEach(System.out::println);
		
	}

}
