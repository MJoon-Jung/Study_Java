package yjp.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {
	public static void main(String[] args) {
//		test1();
		test2();
	}
	public static void test2() {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Tom", 50));
		list.add(new Student("Dan", 10));
		list.add(new Student("Ariana", 30));
		list.add(new Student("Biber", 70));
		list.add(new Student("Sara", 80));
		
		System.out.println(list);
//		Collections.sort(list);
		sort(list);
		System.out.println(list);
		
		
	}
	private static void sort(List<Student> list) {
		/*
		 * list 의 0번 부터 마지막 인덱스의 원소까지 다음을 반복
		 * 현재 인덱스를 i라 하자
		 * min = i;
		 * 
		 * list의 i+1 인덱스로부터 마지막인덱스의 원소까지 다음을반복
		 * 중첩 반복문의 현재 인덱스를 j라하자
		 * 		if(min 인덱스의 원소 값보다 j 인덱스의 원소 값이 작으면)
		 * 			min = j;
		 */
		
		for(int i = 0 ; i< list.size() - 1; i++) {
			int min = i;
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(j).getScore() < list.get(min).getScore()) {
					min = j;
				}
			}
			if(min != i) {
				Student tmp = list.get(i);
				list.set(i, list.get(min));
				list.set(min, tmp);
			}
		}
	}
	public static void test1() {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			list.add(random.nextInt(100) + 1);
		}
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
