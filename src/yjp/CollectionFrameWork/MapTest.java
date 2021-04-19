package yjp.CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		/*
		 * Map 인터페이스이고 구현 클래스가 HashMap, TreeMap, LinkedHashMap 3개가 있다.
		 * 그래서 Map 타입의 변수는 위의 3개 타입의 객체를 수용할 수 있다.
		 * Map은 값을 <Key, value> 쌍으로 저장한다.
		 * Map은 Generic이다.
		 * 클래스, 메소드 내부에서 사용할 데이터 타입을 정하지 않고 
		 * 실제 그 클래스 객체를 만들거나 메소드를 호출할 때 사용할 데이터 타입을 
		 * 파라미터로 받아서 처리하는 것.
		 */
//		test1();
		test2();
		
		
	}
	public static void test2() {
		String [] str = {"To", "be", "or", "not", "to", "be", "is", "a", "problem"};
		
		/*
		 * Map에다 단어를 키로 그 단어가 출현한 횟수를 값으로 저장
		 * Generic의 타입 파라미터는 기본 타입을 허용하지 않는다.
		 */
		
		Map<String, Integer> map = new HashMap<>();
		/*
		 * str 배열에 각 원소에 대해서
		 * 그 원소를 키로 가지는 엔트리가 있는지 검사
		 * 만약에 그러한 엔트리가 있으면
		 * 		map.put(key, ++map.get(key())
		 * 그러한 엔트리가 없으면
		 * 		이 키에 해당하는 단어는 처음 나온거다. 그럼 map에 추가
		 * 		map.put(key, 1)
		 */
		
		for(String s: str) {
			if(map.get(s) != null) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> iter = entrySet.iterator();
//		
//		while(iter.hasNext()) {
//			Map.Entry<String,Integer> entry = iter.next();
//			String myKey = entry.getKey();
//			Integer myValue = entry.getValue();
//			
//			System.out.println("myKey : " + myKey + " myValue : " + myValue);
//		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String myKey = entry.getKey();
			Integer myValue = entry.getValue();
			
			System.out.println("myKey : " + myKey + " myValue : " + myValue);
		}
		
		
	}
	public static void test1() {
		/*
		 * 문자열 타입의 학번을 키로 Student 객체를 값으로 Map에 저장
		 */
		Map<String, Student2> map = new HashMap<>();
		
		//Map에 원소 (<key,value>로 구성된 entry)를 넣을 때는 put 메소드를 사용
		//Map에서 원소(엔트리)를 읽을 때는 get(key) 메소드를 이용
		//이미 존재하는 키 값으로 put 하면 기본 원소를 replace 하게 된다.
		
		map.put("1111", new Student2(1111, "audwns"));
		map.put("1112", new Student2(1112, "rnrnrn"));
		map.put("1115", new Student2(1115, "wjoon"));
		map.put("1114", new Student2(1114, "yeounjin"));
		
		Student2 std1 = map.get("1111");
//		System.out.println(std1);
		//map객체에게 key값 전부 받아오기
		Set<String> keyset = map.keySet();
//		for(String s : keyset) {
//			System.out.println(map.get(s));
//		}
		
//		Iterator<String> iter = keyset.iterator();
//		while(iter.hasNext()) {
//			String key=  iter.next();
//			Student2 std2 = map.get(key);
//			System.out.println(std2);
//		}
		
		Set<Map.Entry<String, Student2>> entrySet =  map.entrySet();
		
		Iterator<Entry<String, Student2>> iter2 = entrySet.iterator();
		while(iter2.hasNext()) {
			Map.Entry<String, Student2> entry = iter2.next();
			String key = entry.getKey();
			Student2 mystd = entry.getValue();
			System.out.println("key : " + key + " mystd : " + mystd);
		}
		
		for(Map.Entry<String, Student2> entry : map.entrySet()) {
			String mykey = entry.getKey();
			Student2 mystd = entry.getValue();
			System.out.println("key : " + mykey + " mystd : " + mystd);
		}
	}
}
class Student2{
	int number;
	String name;
	
	@Override
	public String toString() {
		return "[number : " + number + " name : " + name + " ]";
	}
	
	public Student2(int number, String name) {
		this.number = number;
		this.name = name;
	}
}
