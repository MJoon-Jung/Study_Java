package yjp.CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		/*
		 * Map �������̽��̰� ���� Ŭ������ HashMap, TreeMap, LinkedHashMap 3���� �ִ�.
		 * �׷��� Map Ÿ���� ������ ���� 3�� Ÿ���� ��ü�� ������ �� �ִ�.
		 * Map�� ���� <Key, value> ������ �����Ѵ�.
		 * Map�� Generic�̴�.
		 * Ŭ����, �޼ҵ� ���ο��� ����� ������ Ÿ���� ������ �ʰ� 
		 * ���� �� Ŭ���� ��ü�� ����ų� �޼ҵ带 ȣ���� �� ����� ������ Ÿ���� 
		 * �Ķ���ͷ� �޾Ƽ� ó���ϴ� ��.
		 */
//		test1();
		test2();
		
		
	}
	public static void test2() {
		String [] str = {"To", "be", "or", "not", "to", "be", "is", "a", "problem"};
		
		/*
		 * Map���� �ܾ Ű�� �� �ܾ ������ Ƚ���� ������ ����
		 * Generic�� Ÿ�� �Ķ���ʹ� �⺻ Ÿ���� ������� �ʴ´�.
		 */
		
		Map<String, Integer> map = new HashMap<>();
		/*
		 * str �迭�� �� ���ҿ� ���ؼ�
		 * �� ���Ҹ� Ű�� ������ ��Ʈ���� �ִ��� �˻�
		 * ���࿡ �׷��� ��Ʈ���� ������
		 * 		map.put(key, ++map.get(key())
		 * �׷��� ��Ʈ���� ������
		 * 		�� Ű�� �ش��ϴ� �ܾ�� ó�� ���°Ŵ�. �׷� map�� �߰�
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
		 * ���ڿ� Ÿ���� �й��� Ű�� Student ��ü�� ������ Map�� ����
		 */
		Map<String, Student2> map = new HashMap<>();
		
		//Map�� ���� (<key,value>�� ������ entry)�� ���� ���� put �޼ҵ带 ���
		//Map���� ����(��Ʈ��)�� ���� ���� get(key) �޼ҵ带 �̿�
		//�̹� �����ϴ� Ű ������ put �ϸ� �⺻ ���Ҹ� replace �ϰ� �ȴ�.
		
		map.put("1111", new Student2(1111, "audwns"));
		map.put("1112", new Student2(1112, "rnrnrn"));
		map.put("1115", new Student2(1115, "wjoon"));
		map.put("1114", new Student2(1114, "yeounjin"));
		
		Student2 std1 = map.get("1111");
//		System.out.println(std1);
		//map��ü���� key�� ���� �޾ƿ���
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
