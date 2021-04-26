package yjp.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		test1();
	}
	public static void test1() {
		String sample = "w,a,s,kw,wkd,w,a,s";
		
//		StringTokenizer st = new StringTokenizer(sample , ".,l");
		String [] ar = sample.split(",");
		Map<String,Integer>map = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		/*
		 * st가 위의 구분자로 분리된 토큰들을 들고 있따.
		 * Map이라는 자료구조를 이용해서 각 단어가 몇 번 ㄴ출현했는ㄴ지 그 빈도를 저장하고자 한다.
		 * Map은 Key value 로 저장한다.
		 */
		for (int i = 0; i < ar.length; i++) {

			String str = ar[i];
			Integer value = map.get(str);
			if(value == null) {
				map.put(str, 1);
			}else {
				map.put(str, value+1);
			}
		}
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eIter = entrySet.iterator();
			
		
		
//		Iterator<String> iter = map.keySet().iterator();
//	
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			System.out.println(key + " , " + value);
//		}
//		while(st.hasMoreTokens()) {
//			String str = st.nextToken();
//			System.out.println(str);
//			
//			Integer value = map.get(str);
//			if(value == null) {
//				map.put(str, 1);
//			}else {
//				map.put(str, value + 1);
//			}
//		}
		
		
	}
}
