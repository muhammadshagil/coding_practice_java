package search;

public class BinarySearch {
	
	public static int searchElement(int[] arr, int left, int right, int x){
		if(right>=left){
			int mid = left+(right-left)/2;
			System.out.println(mid);
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid]>x)
				return searchElement(arr, left, mid-1, x);
			
			return searchElement(arr, mid+1, right, x);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] testArray = {3,4,6,10,12,13,15,30,34,36};
		int index = BinarySearch.searchElement(testArray, 0,9,30);
		System.out.println("search result:"+index);
	}

}
