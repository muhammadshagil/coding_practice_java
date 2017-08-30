package sort;

public class BubbleSort {

	public static void bubbleSort(int[] array){
		int n = array.length;
		for(int i=0; i<n-1; i++){
			//j<n-i-1 , becoz in each pass the greatest element moves to its expected position.
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {12,3,14,10,4,7,2,1};
		BubbleSort.bubbleSort(array);
		for(int i : array){
			System.out.print(i+" , ");
		}
	}

}
