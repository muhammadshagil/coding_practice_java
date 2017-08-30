package array;

public class ArrayReverse {
	
	static public void reverseArray(int[] inputArray, int start, int end){
		if (start < end) {
			int temp = inputArray[start];
			inputArray[start] = inputArray[end];
			inputArray[end] = temp;
			reverseArray(inputArray, start+1, end-1);
		}
	}

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5};
		ArrayReverse.reverseArray(inputArray, 0, inputArray.length-1);
		
		for(int i : inputArray)
			System.out.println(i);
	}
}
