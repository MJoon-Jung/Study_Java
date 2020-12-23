import java.util.Arrays;

class StaticBlockTest {
	static int [] arr = new int [10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100)+1;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
	}

}
