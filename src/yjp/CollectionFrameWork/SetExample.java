package yjp.CollectionFrameWork;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}
	private static void test1() {
		/*
		 * HashSet
		 * 순서없고 중복 허용하지 않는 집합
		 */
		Set<String>set = new HashSet<>();
		String [] strArr = {"단어", "중복", "구절", "중복"};
		for(String s : strArr) {
			set.add(s);
		}
		System.out.println(set);
		
		//set은 순서가 없으므로 그냥 for 문으로는 접근이 불가능하다.
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//다 쓰면 iter에서 호출 불가능
		//다시 새롭게 iterator 받아줘야함
		iter = set.iterator();
		System.out.println(iter.next());
	}
	private static void test2() {
		/*
		 * LinkedHashset 은 중복은 허용하지 않지만
		 * 입력된 순서는 유지된다. -> 입력된 순서로 인출된다.
		 */
		Set<String>set = new LinkedHashSet<>();
		String [] strArr = {"단어", "중복", "구절", "중복"};
		for(String s : strArr) {
			set.add(s);
		}
		System.out.println(set);
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

		iter = set.iterator();
		System.out.println(iter.next());
	}
	private static void test3() {
		/*
		 * TreeSet은 중복은 허용하지 않지만
		 * 값에 따라 정렬한다. 값의 순서대로 출력된다.
		 */
		Set<String>set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		String [] strArr = {"단어", "중복", "구절", "중복"};
		for(String s : strArr) {
			set.add(s);
		}
		System.out.println(set);
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

//		iter = set.iterator();
//		System.out.println(iter.next());
	}
}
