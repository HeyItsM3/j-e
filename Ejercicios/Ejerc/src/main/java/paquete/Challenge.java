public class Challenge {
	public static int countTrue(boolean[] arr) {
		int b = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]){
			    b++;
			}
		}
		return b;
	}
}