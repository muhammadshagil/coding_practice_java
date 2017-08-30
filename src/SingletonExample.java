import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;

public class SingletonExample {
	private static SingletonExample testInstance = new SingletonExample();
	public static SingletonExample getTestIntance(){
		return testInstance;
	}
	
public static void main(String[] s){
	SingletonExample test = new SingletonExample();
	double doubleValue = test.getDoubleValue(3, 1, (x,y) -> (double) 1/(1+(y-1)*x));
	System.out.println(doubleValue);
}

public boolean getvalue(int n,Predicate<Integer> predicate){
//	return toDoubleBiFunction.applyAsDouble((n,m)->1/(1+(m-1)*n));
	return predicate.test(n);
}

public int getIntValue(int n,int m , ToIntBiFunction<Integer,Integer> toIntBiFunction){
	return toIntBiFunction.applyAsInt(n, m);	
}

public double getDoubleValue(int x, int y, ToDoubleBiFunction<Integer,Integer> toDoubleBiFunction){
	return toDoubleBiFunction.applyAsDouble(x, y);
}
}
