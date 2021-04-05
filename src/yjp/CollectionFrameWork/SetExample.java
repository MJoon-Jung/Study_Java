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
		 * �������� �ߺ� ������� �ʴ� ����
		 */
		Set<String>set = new HashSet<>();
		String [] strArr = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
		for(String s : strArr) {
			set.add(s);
		}
		System.out.println(set);
		
		//set�� ������ �����Ƿ� �׳� for �����δ� ������ �Ұ����ϴ�.
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//�� ���� iter���� ȣ�� �Ұ���
		//�ٽ� ���Ӱ� iterator �޾������
		iter = set.iterator();
		System.out.println(iter.next());
	}
	private static void test2() {
		/*
		 * LinkedHashset �� �ߺ��� ������� ������
		 * �Էµ� ������ �����ȴ�. -> �Էµ� ������ ����ȴ�.
		 */
		Set<String>set = new LinkedHashSet<>();
		String [] strArr = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
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
		 * TreeSet�� �ߺ��� ������� ������
		 * ���� ���� �����Ѵ�. ���� ������� ��µȴ�.
		 */
		Set<String>set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		String [] strArr = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
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
