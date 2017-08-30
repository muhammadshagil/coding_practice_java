import java.util.Arrays;

public class UniqueNumberFromArray {

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if(arr[arr.length-1] != arr[arr.length-2]){
        	return arr[arr.length-1];
        }
        return arr[0];
      }
    
    
	public static void main(String[] args) {
		double[] arr = {1,.5,1,1,1,1,1};
		System.out.println(UniqueNumberFromArray.findUniq(arr));
		
	}

}
