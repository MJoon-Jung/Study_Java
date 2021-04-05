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
	public void add(int index, Integer value) {
		if(index >= size) return;
		int cnt = 0;
		Node tmp = head;
		while(cnt < index - 1) {
			tmp = tmp.next;
			cnt++;
		}
		Node node = new Node();
		node.value = value;
		if(index == 0) {
			node.next = tmp;
			head = node;
		}else {
			node.next = tmp.next;
			tmp.next = node;
		}
		size++;
	}
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
		li.add(0,22222);
		li.add(8,11111);
		System.out.println(li);
		li.add(11,1010);
		System.out.println(li);
	}
}
