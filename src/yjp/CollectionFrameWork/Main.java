package yjp.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Main m = new Main();
		list.add(new Student("Tom",100,"net"));
		list.add(new Student("Jane",90,"at"));
		list.add(new Student("Jone",20,"het"));
		list.add(new Student("Amy",70,"jet"));
		list.add(new Student("Born",40,"det"));
		System.out.println(list);
		m.sorted(list);
		System.out.println(list);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(3);
//		list.add(-4);
//		list.add(2);
//		list.add(8);
//		list.add(5);
//		list.add(1);
//		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
	}
//	public void sorted(ArrayList<Student> list) {
//		for(int i = 0; i < list.size()-1; i++) {
//			int min = i;
//			for(int j = i+1; j < list.size(); j++) {
//				if(list.get(min).gsc > list.get(j).gsc) {
//					min = j;
//				}
//			}
//			if(min != i) {
//				Student temp = list.get(i);
//				list.set(i, list.get(min));
//				list.set(min, temp);
//			}
//		}
//	}
	public void sorted(ArrayList<Student> list) {
		for(int i = 0; i < list.size()-1; i++) {
			int min = i;
			for(int j = i+1; j < list.size(); j++) {
				char minChar = list.get(min).name.charAt(0);
				char jChar = list.get(j).name.charAt(0);
				if(minChar > jChar) {
					min = j;
				}
			}
			if(min != i) {
				Student temp = list.get(i);
				list.set(i, list.get(min));
				list.set(min, temp);
			}
		}
	}
}
