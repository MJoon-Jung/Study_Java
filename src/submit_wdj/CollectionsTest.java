package submit_wdj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
//		sortTest();
//		shuffleTest();
//		binarySearch();
		List<String> list = new ArrayList<>();
		for(int i = 0; i <= 9; i++) {
			list.add(i + "");
		}
		
		System.out.println(MyBinarySearch(list, 0,list.size() - 1, "3"));
	}
	public static <T>int MyBinarySearch(List<? extends Comparable<T>> list, int left, int right, T key) {
		if(left > right) return -1;
		int middle = (left + right) / 2;
		
		if(list.get(middle).compareTo(key) == 0) {
			return middle;
		}
		if(list.get(middle).compareTo(key) < 0) {
			left = middle + 1;
			return MyBinarySearch(list,left,right,key);
		}else {
			right = middle - 1;
			return MyBinarySearch(list,left, right, key);
		}
	}
	
	public static void binarySearch() {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		int p = Collections.binarySearch(list, 3);
		if(p >= 0) {			
			System.out.println(p+1 + "에 있습니다.");
		}else System.out.println("Not found");
	}
	public static void shuffleTest() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		System.out.println("After shuffling");
		Collections.shuffle(list);
		
		System.out.println(list);
	}
	public static void sortTest() {
		String [] sample = {"i", "Walk", "the", "line"};
		
		List<String> list = Arrays.asList(sample);
		
		Collections.sort(list, (o1,o2)-> o1.compareToIgnoreCase(o2) );
		
		System.out.println(list);
	}
}
