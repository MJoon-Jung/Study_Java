package yjp.OOP.interfaceTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("d");
		list.add("B");
		list.add("f");
		list.add("c");
		list.add("E");
		list.add("a");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, (o1,o2)->{
			String s1 = o1.toLowerCase();
			String s2 = o2.toLowerCase();
			
			return s1.compareTo(s2);
		});
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				String s1 = o1.toLowerCase();
//				String s2 = o2.toLowerCase();
//				
//				return s1.compareTo(s2);
//			}
//
//		});
		System.out.println(list);
		
	}
}
