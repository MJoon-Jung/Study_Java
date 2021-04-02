package yjp.CollectionFrameWork;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LinkedList {
	private Node head;
	private int size;
	public void add(Integer value) {
		Node node = new Node();
		node.value = value;
		if(head == null) {
			head = node;
		}else {
			Node tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
		size++;
	}
	public int size() {
		return size;
	}
	public Integer get(int index) {
		if(index >= size)return null;		
		int idx = 0;
		Node tmp = head;
		while(idx < index) {
			tmp = tmp.next;
			idx++;
		}
		return tmp.value;
	}
	public void remove() {
		Node tmp = head;
		if(size <= 1) {
			head = null;
			if(size==1) size--;
			return;
		}
		while(tmp.next.next != null) {
			tmp = tmp.next;
		}
		tmp.next = null;
		size--;
	}
//	public void add(int index, Integer value) {
//		int cnt = 0;
//		Node tmp = head;
//		while(cnt != index) {
//			tmp = tmp.next;
//		}
//		tmp
//	}
	public String toString() {
		String result = "[ ";
		Node tmp = head;
		while(tmp.next != null) {
			result += tmp.value + " , ";
			tmp = tmp.next;
		}
		result += tmp.value + " ]";
		return result;
	}
	
	
	private class Node{
		Node next;
		Integer value;
		public Node() {
			
		}
	}
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		IntStream.rangeClosed(1, 10).forEach(i -> li.add(i));
		System.out.println(li);
		System.out.println(li.get(5));
		li.remove();
		li.remove();
		System.out.println(li);
	}
}
