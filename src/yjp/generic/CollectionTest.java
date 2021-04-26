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
		 * list �� 0�� ���� ������ �ε����� ���ұ��� ������ �ݺ�
		 * ���� �ε����� i�� ����
		 * min = i;
		 * 
		 * list�� i+1 �ε����κ��� �������ε����� ���ұ��� �������ݺ�
		 * ��ø �ݺ����� ���� �ε����� j������
		 * 		if(min �ε����� ���� ������ j �ε����� ���� ���� ������)
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
