
public class TimeFormatter {
	  public static String makeReadable(int seconds) {
//		    int hour = seconds/3600;
//		    seconds = seconds - (hour*3600);
//		    int min = seconds/60;
//		    seconds = seconds - (min*60);
//		    String readableTime = String.format("%02d:%02d:%02d", hour,min,seconds);
//		    return readableTime;
		    
		    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
		    
		    
		  }

	public static void main(String[] args) {
		System.out.println(TimeFormatter.makeReadable(0));
		
		System.out.println(3.12%2);
	}

}
