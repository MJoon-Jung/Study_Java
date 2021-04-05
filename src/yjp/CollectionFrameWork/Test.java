package yjp.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		
//		test();
//		test2();
//		test3();
		
	}
	public static void test2() {
		List<String> list = new ArrayList<>();
		list.add("milk");
		list.add("bread");
		list.add("butter");
		
		System.out.println(list);
		
		list.add(1, "Apple");
		System.out.println(list);
		
		list.add(2, "Grape");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Iterator<String> iter = list.iterator();
		
//		iter.next() --> °ª ³ª¿È
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}		
	}
	public static void test() {
//		List<Integer>list = new ArrayList();
		List<Integer>list = new LinkedList<>();
		
		IntStream.rangeClosed(1, 100000).forEach(i ->{
			list.add(i);
		});
		double startTime = System.currentTimeMillis();
		
		for(int i = 0; i < list.size(); i++) {
//			list.add(100, (i+1) * 1000);
			list.get(i);
		}
		
		double endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}
	public static void test3() {
		ArrayList<Integer>list = new ArrayList<>();
		
		IntStream.rangeClosed(1, 100000).forEach(i ->{
			list.add(i);
		});
		double startTime = System.currentTimeMillis();
		
		for(int i = 0; i < list.size(); i++) {
//			list.add(100, (i+1) * 1000);
			list.get(i);
		}
		
		double endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}
}
