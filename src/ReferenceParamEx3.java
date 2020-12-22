public class ReferenceParamEx3 {
	public static void main(String [] args) {
		int [] arr = new int [] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));
	}
	static void printArr(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	static int sumArr(int [] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static void sortArr(int [] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			if(index != i) {
				int temp = arr[i];
				arr[i] = min;
				arr[index] = temp;
			}
		}
	}
}
