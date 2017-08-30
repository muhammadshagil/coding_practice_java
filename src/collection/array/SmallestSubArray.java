package array;

/*
 * Given an array of integers and a number x, 
 * find the smallest subarray with sum greater than the given value.
 */
public class SmallestSubArray {
	
	public static int findSmallestSubArray(int[] inputArray, int givenLimit){
		int len = inputArray.length;
		int min_subArray_len = len+1;
		int subArray_start=0;
		for(int start=0; start<len; start++){
			int sumOfSubArray = inputArray[start];
			
			if(sumOfSubArray>givenLimit) return 1;
			
			for(int end=start+1; end<len; end++) {
				sumOfSubArray+=inputArray[end];
				if(sumOfSubArray>givenLimit && end-start+1<min_subArray_len){
					min_subArray_len = end-start+1;
					subArray_start = start;
				}
			}
		}
		
		if(min_subArray_len<= len) {
			for(int i=subArray_start; i<subArray_start+min_subArray_len; i++){
				System.out.println(inputArray[i]);
			}
		}
		
		return min_subArray_len;
		
	}
	public static void main(String[] args) {
		int[] inputArray1 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		int res = SmallestSubArray.findSmallestSubArray(inputArray1, 280);
		System.out.println("length of sub array = "+res);
		
		int[] inputArray2 = {1, 4, 45, 6, 10, 19};
		res = SmallestSubArray.findSmallestSubArray(inputArray2, 51);
		System.out.println("length of sub array = "+res);
	}

}
