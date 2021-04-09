package yjp.CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class QueueTest {
	public static void main(String[] args) {
//		testPriortyQueue();
//		setTest();
		testDequeue();
	}
	private static void testDequeue() {
		Deque<Integer> queue = new ArrayDeque<>();
		
		for(int i = 0; i < 10; i++) {
//			queue.push(i);
			queue.add(i);
			queue.addFirst(i);
//			queue.addLast(i);
//			queue.push(i);
		}
		while(queue.size() > 0) {
			Integer val = queue.poll(); //queue.pollFirst
//			Integer val = queue.pollLast();
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	private static void testPriortyQueue() {
		Queue<Integer> queue = new PriorityQueue<>(new Mycomparator()); 
//		�������� �ص���
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
		for(int i = 10; i > 0; i--) {
			queue.offer(i);
		}
		System.out.println(queue);
		
		for(Integer n : queue) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
		// queue �� ���� ���� ������ ����Ű���� ���� ���� ���� ���� ���ĵǼ� ����
		int len = queue.size();
		for(int i = 0; i < len; i++	) {
			System.out.println((i+1) + "��° ���� : " + queue.poll());
		}
		
		System.out.println();
	}
	private static void setTest() {
		Set<Integer>set = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 45) + 1;
			set.add(random);
		}
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		iter = set.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
class Mycomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}